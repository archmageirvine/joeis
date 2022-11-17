package irvine.math.nauty;

import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.Arrays;

import irvine.math.IntegerUtils;
import irvine.math.graph.Graph;
import irvine.math.graph.GraphFactory;
import irvine.math.z.Z;

/**
 * Main engine for nauty. Based on the C code by Brendan McKay.
 * @author Brendan McKay
 * @author Sean A. Irvine
 */
public class Nauty {

  static final int MAXN = 64;
  private static final int WORDSIZE = 64;
  static final int MAXM = (MAXN + WORDSIZE - 1) / WORDSIZE;
  private static final int NAUTY_INFINITY = 0x40000002;

  // copies of some of the options
  private final boolean mGetCanon;
  private final boolean mDigraph;
  private final boolean mDoMarkers;
  private final int mTcLevel;
  private int mMinInvarLevel;
  private int mMaxInvarLevel;
  private final int mInvarArg;
  private final UserNodeProc mUserNodeProc;
  private final UserAutomProc mUserAutomProc;
  private final UserLevelProc mUserLevelProc;
  private final InvarProc mInvarProc;
  private final Writer mOutfile;
  private final DispatchVec mDispatch;

  private final int mN;
  private Graph mG;
  private final int[] mOrbits;
  private Graph mCanonG;
  private final StatsBlk mStats;

  // temporary versions of some mStats
  private int mInvarSucLevel;

  /* working variables: (the "bsf leaf" is the leaf which is best guess so far at the canonical leaf)  */
  private int mGcaFirst; /* level of greatest common ancestor of current node and first leaf */
  private int mGcaCanon;     /* ditto for current node and bsf leaf */
  private int mNoncheapLevel; /* level of greatest ancestor for which cheapAutom==false */
  private int mAllSameLevel;  /* level of least ancestor of first leaf for which all descendant leaves are known to be equivalent */
  private int mEqlevFirst;   /* level to which codes for this node match those for first leaf */
  private int mEqlevCanon;   /* level to which codes for this node match those for the bsf leaf. */
  private int mCompCanon;    /* -1,0,1 according as code at mEqlevCanon+1 is
                       <,==,> that for bsf leaf.  Also used for
                       similar purpose during leaf processing */
  private int mSameRows;      /* number of rows of mCanonG which are correct for the bsf leaf  BDM:correct description? */
  private int mCanonLevel;    /* level of bsf leaf */
  private int mStabVertex;    /* point fixed in ancestor of first leaf at level mGcaCanon */
  private int mCosetIndex;    /* the point being fixed at level mGcaFirst */

  private boolean mNeedShortPrune;  /* used to flag calls to shortPrune */

  private final int[] mWorkPerm = new int[MAXN];   /* various scratch uses */
  private final NautySet mFixedPts = new NautySet(MAXN);      /* points which were explicitly fixed to get current node */
  private final DoRef mDoRef = new DoRef();
  private final int[] mFirstLab = new int[MAXN];   /* label from first leaf */
  private final int[] mCanonLab = new int[MAXN];   /* label from bsf leaf */
  private final int[] mFirstCode = new int[MAXN + 2];      /* codes for first leaf */
  private final int[] mCanonCode = new int[MAXN + 2];      /* codes for bsf leaf */
  private final int[] mFirsTtc = new int[MAXN + 2];  /* index of target cell for left path */
  private NautySet mActive = new NautySet(MAXM);     /* used to contain index to cells now active for refinement purposes */
  private long[] mWorkspace;
  private int mWorkTop;  /* first and just-after-last addresses of work area to hold automorphism data */
  private int mFmPtr;                   /* pointer into mWorkspace */

  /**
   * This procedure finds generators for the automorphism group of a
   * vertex-coloured graph and optionally finds a canonically labelled
   * isomorph.
   *
   * @param g        the graph
   * @param lab      used for the partition nest which defines the colouring of the graph
   * @param ptn      used for the partition nest which defines the colouring of the graph
   * @param active   If this is not null and <code>options.mDefaultPtn==false</code>,
   *                 it is a set indicating the initial set of active colours.
   * @param orbits   On return, orbits[i] contains the number of the
   *                 least-numbered vertex in the same orbit as i, for
   *                 i=0,1,..., mN-1.
   * @param options  a list of options.
   * @param stats    a list of statistics produced by the procedure.
   * @param ws       a chunk of memory for working storage.
   */
  public Nauty(final Graph g, final int[] lab, final int[] ptn, final NautySet active, final int[] orbits, final OptionBlk options, final StatsBlk stats, final long[] ws) {
    if (options.mDispatch == null) {
      throw new NullPointerException("Null mDispatch vector");
    }
    if (g.order() > MAXN) {
      throw new IllegalArgumentException("N too large for this implementation");
    }
    mN = g.order();
    mDispatch = options.mDispatch;

//    if (options.userrefproc) {
//      mDispatch.refine = options.userrefproc;
//    } else if (mDispatch.refine1 && m == 1) {
//      mDispatch.refine = mDispatch.refine1;
//    }

    mOrbits = orbits;
    mStats = stats;

    mGetCanon = options.mGetCanon != 0;
    mDigraph = options.mDigraph;
    mDoMarkers = options.mWriteMarkers;
    mTcLevel = mDigraph ? 0 : options.mTcLevel;
    mUserNodeProc = options.mUserNodeProc;
    mUserAutomProc = options.mUserAutomProc;
    mUserLevelProc = options.mUserLevelProc;
    mInvarProc = options.mInvarProc;
    mOutfile = options.mOutfile == null ? new OutputStreamWriter(System.out) : options.mOutfile;
    mMinInvarLevel = options.mMinInvarLevel < 0 && options.mGetCanon != 0 ? -options.mMinInvarLevel : options.mMinInvarLevel;
    mMaxInvarLevel = options.mMaxInvarLevel < 0 && options.mGetCanon != 0 ? -options.mMaxInvarLevel : options.mMaxInvarLevel;
    mInvarArg = options.mInvarArg;

    if (mN == 0) {   // Special code for zero-sized long
      stats.mGrpSize = Z.ONE;
      stats.mNumOrbits = 0;
      stats.mNumGenerators = 0;
      //stats.mErrStatus = 0;
      stats.mNumNodes = 1;
      stats.mNumBadLeaves = 0;
      stats.mMaxLevel = 1;
      stats.mTcTotal = 0;
      stats.mCanUpdates = (options.mGetCanon != 0) ? 1 : 0;
      //stats.mInvApplics = 0;
      //stats.mInvSuccesses = 0;
      //stats.mInvarSucLevel = 0;
      return;
    }

    // initialize everything
    final int[] numcells = new int[1];

    if (options.mDefaultPtn) {
      IntegerUtils.identity(lab, mN); // give all vertices same colour
      Arrays.fill(ptn, NAUTY_INFINITY);
      ptn[mN - 1] = 0;
      mActive.clear();
      mActive.set(0);
      numcells[0] = 1;
    } else {
      ptn[mN - 1] = 0;
      //numcells[0] = 0;
      for (int i = 0; i < mN; ++i) {
        if (ptn[i] != 0) {
          ptn[i] = NAUTY_INFINITY;
        } else {
          ++numcells[0];
        }
      }
      if (active == null) {
        mActive.clear();
        for (int i = 0; i < mN; ++i) {
          mActive.set(i);
          while (ptn[i] != 0) {
            ++i;
          }
        }
      } else {
        mActive = active;
      }
    }

    mG = g;
    mCanonG = options.mDigraph ? GraphFactory.createDigraph(g.order()) : GraphFactory.create(g.order());

    IntegerUtils.identity(mOrbits, mN);
    mStats.mGrpSize = Z.ONE;
    mStats.mNumGenerators = 0;
    mStats.mNumNodes = 0;
    mStats.mNumBadLeaves = 0;
    mStats.mTcTotal = 0;
    mStats.mCanUpdates = 0;
    mStats.mNumOrbits = mN;
    mNoncheapLevel = 1;
    mEqlevCanon = -1;       // needed even if !mGetCanon

    int worksize = ws.length;
    if (worksize >= 2) {
      mWorkspace = ws;
    } else {
      mWorkspace = new long[2 * MAXM];
      worksize = 2;
    }
    mWorkTop = worksize - worksize % 2; // ptr into mWorkTop
    mFmPtr = 0;

    //mStats.mErrStatus = 0;
    mNeedShortPrune = false;
    mInvarSucLevel = NAUTY_INFINITY;
    firstPathNode(lab, ptn, 1, numcells[0]);

    if (mGetCanon) {
      mDispatch.updateCan(mG, mCanonG, mCanonLab, mSameRows);
      System.arraycopy(mCanonLab, 0, lab, 0, mN);
    }
    //mStats.mInvarSucLevel = mInvarSucLevel == NAUTY_INFINITY ? 0 : mInvarSucLevel;
    //mStats.mInvApplics = mInvApplics;
    //mStats.mInvSuccesses = mInvSuccesses;
  }

  /**
   * Produces a node on the leftmost
   * path down the tree.  The parameters describe the level and the current
   * colour partition.  The set of active cells is taken from the global set
   * <code>mActive</code>.  If the refined partition is not discrete, the leftmost child
   * is produced by calling <code>firstPathNode</code>, and the other children by calling
   * <code>otherNode</code>.
   * @param lab labels
   * @param ptn partition
   * @param level current level
   * @param nc number of cells
   * @return first path node level to return to
   */
  private int firstPathNode(final int[] lab, final int[] ptn, final int level, final int nc) {
    final int[] numcells = {nc};
    final int[] qinvar = new int[1];
    final int[] refcode = new int[1];
    final int[] tc = new int[1];
    final int[] tcellsize = new int[1];

    ++mStats.mNumNodes;

    // refine partition
    mDoRef.doRef(mG, lab, ptn, level, numcells, qinvar, mWorkPerm, mActive, refcode, mDispatch, mInvarProc, mMinInvarLevel, mMaxInvarLevel, mInvarArg, mDigraph);
    mFirstCode[level] = refcode[0];
    if (qinvar[0] > 0) {
      //++mInvApplics;
      if (qinvar[0] == 2) {
        //++mInvSuccesses;
        if (mMinInvarLevel < 0) {
          mMinInvarLevel = level;
        }
        if (mMaxInvarLevel < 0) {
          mMaxInvarLevel = level;
        }
        if (level < mInvarSucLevel) {
          mInvarSucLevel = level;
        }
      }
    }

    long tcell = 0;
    tc[0] = -1;
    if (numcells[0] != mN) {
     /* locate new target cell, setting tc to its position in lab, tcell to its contents, and tcellsize to its size: */
      tcell = NautyUtil.makeTargetCell(mG, lab, ptn, level, tcellsize, tc, mTcLevel, mDigraph, -1, mDispatch);
      mStats.mTcTotal += tcellsize[0];
    }
    mFirsTtc[level] = tc[0];

    // optionally call user-defined node examination procedure
    if (mUserNodeProc != null) {
      mUserNodeProc.userNodeProc(mG, lab, ptn, level, numcells[0], tc[0], mFirstCode[level]);
    }

    if (numcells[0] == mN) {      // found first leaf?
      firstTerminal(lab, level);
      if (mUserLevelProc != null) {
        mUserLevelProc.userLevelProc(lab, ptn, level, mOrbits, mStats, 0, 1, 1, mN, 0, mN);
      }
      return level - 1;
    }

    if (mNoncheapLevel >= level && !mDispatch.cheapAutom(ptn, level, mDigraph, mN)) {
      mNoncheapLevel = level + 1;
    }

    // use the elements of the target cell to produce the children
    int tv;
    int tv1;
    int childcount = 0;
    int index = 0;
    int rtnlevel;
    for (tv1 = tv = NautyUtil.nextElement(tcell, -1); tv >= 0; tv = NautyUtil.nextElement(tcell, tv)) {
      if (mOrbits[tv] == tv) {  /* ie, not equiv to previous child */
        NautyUtil.breakout(lab, ptn, level + 1, tc[0], tv, mActive);
        mFixedPts.set(tv);
        mCosetIndex = tv;
        if (tv == tv1) {
          rtnlevel = firstPathNode(lab, ptn, level + 1, numcells[0] + 1);
          childcount = 1;
          mGcaFirst = level;
          mStabVertex = tv1;
        } else {
          rtnlevel = otherNode(lab, ptn, level + 1, numcells[0] + 1);
          ++childcount;
        }
        mFixedPts.clear(tv);
        if (rtnlevel < level) {
          return rtnlevel;
        }
        if (mNeedShortPrune) {
          mNeedShortPrune = false;
          tcell = NautyUtil.shortPrune(tcell, mWorkspace, mFmPtr - 1);
        }
        recover(ptn, level);
      }
      if (mOrbits[tv] == tv1) { /* ie, in same orbit as tv1 */
        ++index;
      }
    }
    mStats.mGrpSize = mStats.mGrpSize.multiply(index);
    if (tcellsize[0] == index && mAllSameLevel == level + 1) {
      --mAllSameLevel;
    }
    if (mDoMarkers) {
      try {
        writeMarker(level, tv1, index, tcellsize[0], mStats.mNumOrbits, numcells[0]);
      } catch (final IOException e) {
        throw new RuntimeException(e);
      }
    }
    if (mUserLevelProc != null) {
      mUserLevelProc.userLevelProc(lab, ptn, level, mOrbits, mStats, tv1, index, tcellsize[0], numcells[0], childcount, mN);
    }
    return level - 1;
  }

  /**
   * Produces a node other than an ancestor
   * of the first leaf.  The parameters describe the level and the colour
   * partition.  The list of active cells is found in the global set <code>mActive</code>.
   * The value returned is the level to return to.
   * @param lab labels
   * @param ptn partition
   * @param level current level
   * @param nc ???
   */
  private int otherNode(final int[] lab, final int[] ptn, final int level, final int nc) {
    final int[] numcells = {nc};
    final int[] qinvar = new int[1];
    final int[] refcode = new int[1];
    final int[] tcellsize = new int[1];
    final int[] tc = new int[1];
    long tcell = 0;

    ++mStats.mNumNodes;

    // refine partition
    mDoRef.doRef(mG, lab, ptn, level, numcells, qinvar, mWorkPerm, mActive, refcode, mDispatch, mInvarProc, mMinInvarLevel, mMaxInvarLevel, mInvarArg, mDigraph);
    final int code = refcode[0];
    if (qinvar[0] > 0) {
      //++mInvApplics;
      if (qinvar[0] == 2) {
        //++mInvSuccesses;
        if (level < mInvarSucLevel) {
          mInvarSucLevel = level;
        }
      }
    }

    if (mEqlevFirst == level - 1 && code == mFirstCode[level]) {
      mEqlevFirst = level;
    }
    if (mGetCanon) {
      if (mEqlevCanon == level - 1) {
        if (code < mCanonCode[level]) {
          mCompCanon = -1;
        } else if (code > mCanonCode[level]) {
          mCompCanon = 1;
        } else {
          mCompCanon = 0;
          mEqlevCanon = level;
        }
      }
      if (mCompCanon > 0) {
        mCanonCode[level] = code;
      }
    }

    tc[0] = -1;
   /* If children will be required, find new target cell and set tc to its
      position in lab, tcell to its contents, and tcellsize to its size: */

    if (numcells[0] < mN && (mEqlevFirst == level || (mGetCanon && mCompCanon >= 0))) {
      if (!mGetCanon || mCompCanon < 0) {
        tcell = NautyUtil.makeTargetCell(mG, lab, ptn, level, tcellsize, tc, mTcLevel, mDigraph, mFirsTtc[level], mDispatch);
        if (tc[0] != mFirsTtc[level]) {
          mEqlevFirst = level - 1;
        }
      } else {
        tcell = NautyUtil.makeTargetCell(mG, lab, ptn, level, tcellsize, tc, mTcLevel, mDigraph, -1, mDispatch);
      }
      mStats.mTcTotal += tcellsize[0];
    }

    if (mUserNodeProc != null) {
      mUserNodeProc.userNodeProc(mG, lab, ptn, level, numcells[0], tc[0], code);
    }

    // call processNode to classify the type of this node
    int rtnlevel = processNode(lab, ptn, level, numcells[0]);
    if (rtnlevel < level) {   // keep returning if necessary
      return rtnlevel;
    }
    if (mNeedShortPrune) {
      mNeedShortPrune = false;
      tcell = NautyUtil.shortPrune(tcell, mWorkspace, mFmPtr - 1);
    }

    if (!mDispatch.cheapAutom(ptn, level, mDigraph, mN)) {
      mNoncheapLevel = level + 1;
    }

    // use the elements of the target cell to produce the children
    final int tv1 = NautyUtil.nextElement(tcell, -1);
    for (int tv = tv1; tv >= 0; tv = NautyUtil.nextElement(tcell, tv)) {
      NautyUtil.breakout(lab, ptn, level + 1, tc[0], tv, mActive);
      mFixedPts.set(tv);
      rtnlevel = otherNode(lab, ptn, level + 1, numcells[0] + 1);
      mFixedPts.clear(tv);

      if (rtnlevel < level) {
        return rtnlevel;
      }
      // use stored automorphism data to prune target cell
      if (mNeedShortPrune) {
        mNeedShortPrune = false;
        tcell = NautyUtil.shortPrune(tcell, mWorkspace, mFmPtr - 1);
      }
      if (tv == tv1) {
        tcell = NautyUtil.longPrune(tcell, mFixedPts, mWorkspace, 0, mFmPtr);
      }

      recover(ptn, level);
    }

    return level - 1;
  }

  /*
   * Process the first leaf of the tree.
   */
  private void firstTerminal(final int[] lab, final int level) {
    mStats.mMaxLevel = level;
    mGcaFirst = level;
    mAllSameLevel = level;
    mEqlevFirst = level;
    mFirstCode[level + 1] = 0x7fff;
    mFirsTtc[level + 1] = -1;

    System.arraycopy(lab, 0, mFirstLab, 0, mN);

    if (mGetCanon) {
      mCanonLevel = level;
      mEqlevCanon = level;
      mGcaCanon = level;
      mCompCanon = 0;
      mSameRows = 0;
      System.arraycopy(lab, 0, mCanonLab, 0, mN);
      System.arraycopy(mFirstCode, 0, mCanonCode, 0, level + 1);
      mCanonCode[level + 1] = 0x7fff;
      mStats.mCanUpdates = 1;
    }
  }

  /*
   * Process a node other than the first leaf or its ancestors.  It is first
   * classified into one of five types and then action is taken appropriate
   * to that type.  The types are
   *
   * 0:   Nothing unusual.  This is just a node internal to the tree whose
   * children need to be generated sometime.
   * 1:   This is a leaf equivalent to the first leaf.  The mapping from
   * mFirstLab to lab is thus an automorphism.  After processing the
   * automorphism, we can return all the way to the closest invocation
   * of firstPathNode.
   * 2:   This is a leaf equivalent to the bsf leaf.  Again, we have found an
   * automorphism, but it may or may not be as useful as one from a
   * type-1 node.  Return as far up the tree as possible.
   * 3:   This is a new bsf node, provably better than the previous bsf node.
   * After updating <code>mCanonLab</code> etc., treat it the same as type 4.
   * 4:   This is a leaf for which we can prove that no descendant is
   * equivalent to the first or bsf leaf or better than the bsf leaf.
   * Return up the tree as far as possible, but this may only be by
   * one level.
   *
   * Types 2 and 3 can't occur if <code>mGetCanon==false</code>.
   * The value returned is the level in the tree to return to, which can be
   * anywhere up to the closest invocation of <code>firstPathNode</code>.
   */
  private int processNode(final int[] lab, final int[] ptn, final int level, final int numcells) {
    final int[] sr = new int[1];

    int code = 0;
    if (mEqlevFirst != level && (!mGetCanon || mCompCanon < 0)) {
      code = 4;
    } else if (numcells == mN) {
      if (mEqlevFirst == level) {
        for (int i = 0; i < mN; ++i) {
          mWorkPerm[mFirstLab[i]] = lab[i];
        }

        if (mGcaFirst >= mNoncheapLevel || mDispatch.isAutomorphism(mG, mWorkPerm, mDigraph)) {
          code = 1;
        }
      }
      if (code == 0) {
        if (mGetCanon) {
          sr[0] = 0;
          if (mCompCanon == 0) {
            if (level < mCanonLevel) {
              mCompCanon = 1;
            } else {
              mDispatch.updateCan(mG, mCanonG, mCanonLab, mSameRows);
              mSameRows = mN;
              mCompCanon = mDispatch.testCanLab(mG, mCanonG, lab, sr);
            }
          }
          if (mCompCanon == 0) {
            for (int i = 0; i < mN; ++i) {
              mWorkPerm[mCanonLab[i]] = lab[i];
            }
            code = 2;
          } else if (mCompCanon > 0) {
            code = 3;
          } else {
            code = 4;
          }
        } else {
          code = 4;
        }
      }
    }

    if (code != 0 && level > mStats.mMaxLevel) {
      mStats.mMaxLevel = level;
    }
    switch (code) {
      case 0:                 /* nothing unusual noticed */
        return level;

      case 1:                 /* lab is equivalent to mFirstLab */
        if (mFmPtr == mWorkTop) {
          mFmPtr -= 2;
        }
        mDoRef.fmperm(mWorkPerm, mWorkspace, mFmPtr, mFmPtr + 1, mN);
        mFmPtr += 2;
        mStats.mNumOrbits = NautyUtil.orbJoin(mOrbits, mWorkPerm, mN);
        ++mStats.mNumGenerators;
        if (mUserAutomProc != null) {
          mUserAutomProc.automorphism(mStats.mNumGenerators, mWorkPerm, mOrbits,
            mStats.mNumOrbits, mStabVertex, mN);
        }
        return mGcaFirst;

      case 2:                 /* lab is equivalent to mCanonLab */
        if (mFmPtr == mWorkTop) {
          mFmPtr -= 2;
        }
        mDoRef.fmperm(mWorkPerm, mWorkspace, mFmPtr, mFmPtr + 1, mN);
        mFmPtr += 2;
        final int save = mStats.mNumOrbits;
        mStats.mNumOrbits = NautyUtil.orbJoin(mOrbits, mWorkPerm, mN);
        if (mStats.mNumOrbits == save) {
          if (mGcaCanon != mGcaFirst) {
            mNeedShortPrune = true;
          }
          return mGcaCanon;
        }
        ++mStats.mNumGenerators;
        if (mUserAutomProc != null) {
          mUserAutomProc.automorphism(mStats.mNumGenerators, mWorkPerm, mOrbits, mStats.mNumOrbits, mStabVertex, mN);
        }
        if (mOrbits[mCosetIndex] < mCosetIndex) {
          return mGcaFirst;
        }
        if (mGcaCanon != mGcaFirst) {
          mNeedShortPrune = true;
        }
        return mGcaCanon;

      case 3:                 /* lab is better than mCanonLab */
        ++mStats.mCanUpdates;
        System.arraycopy(lab, 0, mCanonLab, 0, mN);
        mCanonLevel = mEqlevCanon = mGcaCanon = level;
        mCompCanon = 0;
        mCanonCode[level + 1] = 0x7fff;
        mSameRows = sr[0];
        break;

      case 4:                /* non-automorphism terminal node */
        ++mStats.mNumBadLeaves;
        break;
      default:
        break;
    }

    /* only cases 3 and 4 get this far: */
    final boolean ispruneok;
    if (level != mNoncheapLevel) {
      ispruneok = true;
      if (mFmPtr == mWorkTop) {
        mFmPtr -= 2;
      }
      NautyUtil.fmptn(lab, ptn, mNoncheapLevel, mWorkspace, mFmPtr, mFmPtr + 1, mN);
      mFmPtr += 2;
    } else {
      ispruneok = false;
    }

    final int save = mAllSameLevel > mEqlevCanon ? mAllSameLevel - 1 : mEqlevCanon;
    final int newlevel = mNoncheapLevel <= save ? mNoncheapLevel - 1 : save;

    if (ispruneok && newlevel != mGcaFirst) {
      mNeedShortPrune = true;
    }
    return newlevel;
  }

  /*
   * Recover the partition nest at level 'level' and update various other
   *  parameters.
   */
  private void recover(final int[] ptn, final int level) {
    for (int i = 0; i < mN; ++i) {
      if (ptn[i] > level) {
        ptn[i] = NAUTY_INFINITY;
      }
    }
    if (level < mNoncheapLevel) {
      mNoncheapLevel = level + 1;
    }
    if (level < mEqlevFirst) {
      mEqlevFirst = level;
    }
    if (mGetCanon) {
      if (level < mGcaCanon) {
        mGcaCanon = level;
      }
      if (level <= mEqlevCanon) {
        mEqlevCanon = level;
        mCompCanon = 0;
      }
    }
  }

  /**
   * Write statistics concerning an ancestor of the first leaf.
   *
   * @param level its level
   * @param tv the vertex fixed to get the first child = the smallest-numbered
   * vertex in the target cell
   * @param tCellSize  the size of the target cell
   * @param index the number of vertices in the target cell which were equivalent
   * to tv = the index of the stabiliser of tv in the group
   * fixing the colour partition at this level
   * @param numOrbits the number of orbits of the group generated by all the
   * automorphisms so far discovered
   * @param numCells = the total number of cells in the equitable partition at this
   * level
   * @throws java.io.IOException if an I/O error occurs.
   */
  void writeMarker(final int level, final int tv, final int index, final int tCellSize, final int numOrbits, final int numCells) throws IOException {
    mOutfile.write("level " + level + ":  ");
    if (numCells != numOrbits) {
      mOutfile.write(numCells + " cell");
      if (numCells == 1) {
        mOutfile.write("; ");
      } else {
        mOutfile.write("s; ");
      }
    }
    mOutfile.write(numOrbits + " orbit");
    if (numOrbits == 1) {
      mOutfile.write("; ");
    } else {
      mOutfile.write("s; ");
    }
    mOutfile.write(tv + " fixed; index " + index);
    //mOutfile.write((tv + NautyUtil.sLabelOrg) + " fixed; index " + index);
    if (tCellSize != index) {
      mOutfile.write("/" + tCellSize);
    }
    mOutfile.write("\n");
  }

  /**
   * Canonical form of graph.
   * @return canonical graph
   */
  public Graph canon() {
    return mCanonG;
  }
}

