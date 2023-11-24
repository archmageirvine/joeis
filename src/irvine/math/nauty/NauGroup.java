package irvine.math.nauty;

import java.util.List;

import irvine.math.IntegerUtils;

/**
 * Procedures for handling groups found by nauty.
 * @author B. D. McKay
 * @author Sean A. Irvine (minimal Java port)
 */
public class NauGroup implements UserLevelProc, UserAutomProc {

  //static permrec *freelist = null;
  //static int freelist_n = 0;

  private GroupRecord mGroup = null;
  private int mGroupDepth = 0;
  private CosetRecord[] mCoset = new CosetRecord[1];
  private PermRecord mGens;
  //DYNALLSTAT(set, workset, workset_sz);
  //DYNALLSTAT(int, allp, allp_sz);
  //DYNALLSTAT(int, id, id_sz);


  /*
   * Get a permrec of order n.  This procedure and the next one are
   * designed to be efficient if lots of group ops are done with the
   * same value of n.
   */
  PermRecord newPermRec(final int n) {
//    PermRecord p;
//
//    if (freelist_n != n)
//    {
//      while (freelist != null)
//      {
//        p = freelist;
//        freelist = freelist->mPtr;
//        free(p);
//      }
//      freelist_n = n;
//    }
//
//    if (freelist != null)
//    {
//      p = freelist;
//      freelist = freelist->mPtr;
//      return p;
//    }
//
//    p = (permrec*) malloc(sizeof(permrec)+(freelist_n-2)*sizeof(int));
//
//    if (p == null)
//    {
//      fprintf(ERRFILE, ">E malloc failed in newPermRec()\n");
//      exit(1);
//    }
//
//    return p;
    // TODO Above version remembers lists for reuse
//    PermRecord q = p;
//    for (int k = 1; k < n; ++k) {
//      q.mPtr = new PermRecord();
//      q = q.mPtr;
//    }
    return new PermRecord(n);
  }


  /* Free a permrec of given size. */
  void freePermRec(final PermRecord p, final int n) {
//    PermRecord q;
//
//    if (p == null) {
//      return;
//    }
//
//    if (freelist_n != n) {
//      while (freelist) {
//        q = freelist;
//        freelist = freelist->mPtr;
//        free(q);
//      }
//      freelist_n = n;
//    }
//
//    p->mPtr = freelist;
//    freelist = p;
  }


  /* Give the address of the group structure, cutting it loose if requested. */
  GroupRecord groupPtr(final boolean cutloose) {
    final GroupRecord p = mGroup;
    if (cutloose) {
      mGroup = null;
      mGroupDepth = 0;
      mCoset = null;
      //coset_sz = 0;
    }
    return p;
  }


  /* Free (or pretend to free) group structure. */
  void freeGroup(final GroupRecord grp) {
    int i, j;
    CosetRecord[] p;
    PermRecord q;
    PermRecord qq;

    for (i = 0; i < grp.mDepth; ++i) {
      p = grp.mLevelInfo.get(i).mRepList;
      if (p != null) {
        for (j = grp.mLevelInfo.get(i).mOrbitSize; --j >= 0; ) {
          freePermRec(p[j].mRep, grp.mN);
          p[j].mRep = null;
        }
      }
    }

    if (grp.mDepth > 0)  {
      p = grp.mLevelInfo.get(0).mRepList;
      if (p != null && p != mCoset) {
        //free(p);
        grp.mLevelInfo.get(0).mRepList = null;
      }

      q = grp.mLevelInfo.get(0).mGens;
      while (q != null) {
        qq = q;
        q = q.mPtr;
        freePermRec(qq, grp.mN);
      }
      grp.mLevelInfo.get(0).mGens = null;
    }
  }

  @Override
  public void automorphism(final int count, final int[] perm, final int[] orbits, final int numorbits, final int stabvertex, final int n) {
    final PermRecord p = newPermRec(n);
    System.arraycopy(perm, 0, p.mP, 0, n);
    p.mPtr = mGens;
    mGens = p;
  }

  @Override
  public void userLevelProc(final int[] lab, final int[] ptn, final int level, final int[] orbits, final StatsBlk stats,
                            final int tv, final int index, final int tcellsize, final int numcells, final int cc, final int n) {
    if (numcells == n) {
      final int depth = level - 1;

      if (mGroup != null) {
        freeGroup(mGroup);
      }

      if (depth > mGroupDepth || mGroup == null) {
        mGroup = new GroupRecord(depth);
//        group.mLevelInfo = Arrays.copyOf(group.mLevelInfo, depth);
//          sz = sizeof(GroupRecord);
//        else            sz = sizeof(GroupRecord) + (depth-1)*sizeof(levelrec);
//        if (group) group = (GroupRecord*)realloc((void*)group, sz);
//        else       group = (GroupRecord*)malloc(sz);
//        if (group == null)
//        {
//          fprintf(ERRFILE, ">E malloc failed in grouplevelproc\n");
//          exit(1);
//        }
        mGroupDepth = depth;
      }

      mGroup.mN = n;
      mGroup.mDepth = depth;
      mGens = null;
      return;
    }

    final LevelRecord lr = mGroup.mLevelInfo.get(level - 1);
    lr.mFixedPt = tv;
    lr.mOrbitSize = index;
    lr.mGens = mGens;
    lr.mRepList = null;

//    if (level == 1) {
//      mGroup.mNumOrbits = stats.mNumOrbits;
//    }
  }


  /* Make all mCoset representatives for this group */
  void makeCosetReps(final GroupRecord grp) {
    //DYNALLSTAT(int, queue, queue_sz);
    //DYNALLSTAT(int, lab, lab_sz);

    final int n = grp.mN;
    final int depth = grp.mDepth;

    final int[] queue = new int[n];
    final int[] lab = new int[n];

    int j = 0;
    for (int i = 0; i < depth; ++i) {
      j += grp.mLevelInfo.get(i).mOrbitSize;
    }

    if (j > 0) {
      mCoset = new CosetRecord[j];
      //DYNALLOC1(cosetrec, mCoset, coset_sz, j, "malloc");
    }

    //crp = 0;
    for (int i = 0; i < depth; ++i) {
      final CosetRecord[] recs = new CosetRecord[grp.mLevelInfo.get(i).mOrbitSize];
      for (int jj = 0; jj < recs.length; ++jj) {
        recs[jj] = new CosetRecord();
      }
      grp.mLevelInfo.get(i).mRepList = recs;
      //crp += grp.mLevelInfo[i].mOrbitSize;
    }

    for (int i = 0; i < depth; ++i) {
      final CosetRecord[] cr = grp.mLevelInfo.get(i).mRepList;
      final PermRecord gen = grp.mLevelInfo.get(i).mGens;
      for (j = 0; j < n; ++j) {
        lab[j] = -1;
      }
      queue[0] = grp.mLevelInfo.get(i).mFixedPt;
      lab[queue[0]] = 0;
      //cr[0].mImage = queue[0];
      cr[0].mRep = null;
      int head = 0;
      int tail = 1;
      int index = 0;
      while (head < tail) {
        j = queue[head++];
        final int[] p = cr[lab[j]].mRep != null ? cr[lab[j]].mRep.mP : null;
        for (PermRecord g = gen; g != null; g = g.mPtr) {
          final int k = g.mP[j];
          if (lab[k] < 0) {
            ++index;
            lab[k] = index;
            queue[tail++] = k;
            //cr[index].mImage = k;
            cr[index].mRep = newPermRec(n);
            final int[] q = cr[index].mRep.mP;
            if (p == null) {
              System.arraycopy(g.mP, 0, q, 0, n);
            } else {
              for (int l = 0; l < n; ++l) {
                q[l] = g.mP[p[l]];
              }
            }
          }
        }
      }
    }
  }


  /* Puts in len[0..] the cycle lengths of p.  If sort, sort them.
     Return the number of cycles. */
//  int permcycles(int *p, int n, int *len, boolean sort) {
//    int m, i, j, k, h, nc, leni;
//
//    m = (n + WORDSIZE - 1) / WORDSIZE;
//    DYNALLOC1(set, workset, workset_sz, m, "malloc");
//
//    EMPTYSET(workset, m);
//
//    nc = 0;
//    for (i = 0; i < n; ++i)
//      if (!ISELEMENT(workset, i))
//      {
//        k = 1;
//        for (j = p[i]; j != i; j = p[j])
//        {
//          ADDELEMENT(workset, j);
//          ++k;
//        }
//        len[nc++] = k;
//      }
//
//    if (sort && nc > 1)
//    {
//      j = nc / 3;
//      h = 1;
//      do
//        h = 3 * h + 1;
//      while (h < j);
//
//      do
//      {
//        for (i = h; i < nc; ++i)
//        {
//          leni = len[i];
//          for (j = i; len[j-h] > leni; )
//          {
//            len[j] = len[j-h];
//            if ((j -= h) < h) break;
//          }
//          len[j] = leni;
//        }
//        h /= 3;
//      }
//      while (h > 0);
//    }
//
//    return nc;
//  }


  /* Recursive routine used by allgroup. */
//  static void groupelts(levelrec *lr, int n, int level, void (*action)(int*, int),
//  int *before, int *after, int *id) {
//    int i, j, orbsize;
//    int *p, *cr;
//    cosetrec *mCoset;
//
//    mCoset = lr[level].mRepList;
//    orbsize = lr[level].mOrbitSize;
//
//    for (j = 0; j < orbsize; ++j)
//    {
//      cr = (mCoset[j].rep == null ? null : mCoset[j].rep->p);
//      if (before == null)
//        p = cr;
//      else if (cr == null)
//        p = before;
//      else
//      {
//        p = after;
//        for (i = 0; i < n; ++i) p[i] = cr[before[i]];
//      }
//
//      if (level == 0)
//        (*action)((p == null ? id : p), n);
//      else
//      groupelts(lr, n, level-1, action, p, after+n, id);
//    }
//  }


  /* Call action(p, n) for every element of the group, including the identity.
     The identity is always the first call. */
//  void allgroup(GroupRecord *grp, void (*action)(int*, int)) {
//    int i, depth, n;
//
//    depth = grp->depth;
//    n = grp->n;
//
//    DYNALLOC1(int, id, id_sz, n, "malloc");
//    for (i = 0; i < n; ++i) id[i] = i;
//
//    if (depth == 0)
//    {
//      (*action)(id, n);
//      return;
//    }
//
//    DYNALLOC1(int, allp, allp_sz, n*depth, "malloc");
//
//    groupelts(grp->mLevelInfo, n, depth-1, action, null, allp, id);
//  }


  /* Recursive routine used by allgroup2. */
  static boolean groupelts2(final List<LevelRecord> lr, final int n, final int level, final GroupAction action,
                         final int[] before, final int beforePos, final int[] after, final int afterPos, final int[] id) {
    final CosetRecord[] coset = lr.get(level).mRepList;
    final int orbsize = lr.get(level).mOrbitSize;

    int pos;
    for (int j = 0; j < orbsize; ++j) {
      //System.err.println("level = " + level + " j=" + j);
      final int[] cr = coset[j].mRep == null ? null : coset[j].mRep.mP;
      final int[] p;
      if (before == null) {
        p = cr;
        pos = 0;
      } else if (cr == null) {
        p = before;
        pos = beforePos;
      } else {
        p = after;
        pos = afterPos;
        for (int i = 0; i < n; ++i) {
          p[afterPos + i] = cr[before[beforePos + i]];
        }
      }

      if (level == 0) {
        if (action.groupAction(p == null ? id : p, p == null ? 0 : pos, n)) {
          return true;
        }
      } else {
        if (groupelts2(lr, n, level - 1, action, p, pos, after, afterPos + n, id)) {
          return true;
        }
      }
    }
    return false;
  }


  /* Call action(p, n, &abort) for every element of the group, including
     the identity.  The identity is always the first call.
     If action() stores a non-zero value in abort, group generation is
     aborted and the abort value is returned by this procedure.  If no
     non-zero value is ever returned in abort by action(), this
     procedure returns 0. */
  static boolean allgroup2(final GroupRecord grp, final GroupAction action) {
    final int depth = grp.mDepth;
    final int n = grp.mN;

    final int[] id = new int[n];
    IntegerUtils.identity(id);

    if (depth == 0) {
      //System.err.println("Using groupAction depth=0");
      return action.groupAction(id, 0, n);
    }

    final int[] allp = new int[n * depth];
    //System.err.println("Using groupelts2 depth=" + depth); // SAI

    return groupelts2(grp.mLevelInfo, n, depth - 1, action, null, 0, allp, 0, id);
  }

}

