package irvine.math.nauty;

import java.io.IOException;
import java.io.PrintStream;
import java.util.Arrays;

import irvine.math.graph.Graph;
import irvine.math.graph.GraphFactory;
import irvine.math.graph.SmallGraph;

/**
 * Generate graphs.
 * @author B. D. McKay
 * @author Sean A. Irvine
 */
public class GenerateGraphs {

  static final int MAXN = 32;
  private static final int WORDSIZE = 64;
  static final int MAXM = (MAXN + WORDSIZE - 1) / WORDSIZE;
  private static final int MIN_SPLIT_LEVEL = 6;
  static int sMultiplicity;

  private final StatsBlk mNautyStats = new StatsBlk();
  private final int mMod;

  private GraphProcessor mOutProc = new NullWrite();

  int mConnec;              /* 1 for -c, 2 for -C, 0 for neither */
  boolean mCanonise;               /* presence of -l */
  private int mMinDeg = 0;
  private int mMaxDeg = MAXN;
  int mMaxN;
  private int mMinE;
  int mMaxE;

  int mOdometer;
  private int mSplitLevel;
  private Graph mGCan = null;

  // 1 << x
  static final int[] XBIT = {
    0x00000001, 0x00000002, 0x00000004, 0x00000008,
    0x00000010, 0x00000020, 0x00000040, 0x00000080,
    0x00000100, 0x00000200, 0x00000400, 0x00000800,
    0x00001000, 0x00002000, 0x00004000, 0x00008000,
    0x00010000, 0x00020000, 0x00040000, 0x00080000,
    0x00100000, 0x00200000, 0x00400000, 0x00800000,
    0x01000000, 0x02000000, 0x04000000, 0x08000000,
    0x10000000, 0x20000000, 0x40000000, 0x80000000
  };

  static final long[] BIT = new long[64];
  static {
    long b = 1L;
    for (int k = BIT.length - 1; k >= 0; --k, b <<= 1) {
      BIT[k] = b;
    }
  }

  static int xNextBit(final int x) {
    return 31 - Integer.numberOfLeadingZeros(x);
  }


  final LevelData[] mLevelData = new LevelData[MAXN];      /* data[n] is data for n -> n+1 */
  final long[] mEdgeCount = new long[1 + MAXN * (MAXN - 1) / 2];  /* counts by number of edges */
  final long[] mNodesByLevel = new long[MAXN];     /* nodes at each level */

  private static final long MSK63C = 0x7FFFFFFFFFFFFFFFL;
  static long bitmask(final int x) {
    return MSK63C >>> x;
  }

  /**
   * Construct a new graph generator.
   * @param mod modulus for subset (use 1 to generate everything)
   */
  public GenerateGraphs(final int mod) {
    mMod = mod;
    mCanonise = false;
    for (int k = 0; k < mLevelData.length; ++k) {
      mLevelData[k] = new LevelData();
    }
  }

  /* make the level data for each level */
  void makeLevelData(final boolean restricted) {
    for (int n = 1; n < mMaxN; ++n) {
      final int nn = mMaxDeg <= n ? mMaxDeg : n;
      int ncj = 1;
      int nxsets = 1;
      for (int j = 1; j <= nn; ++j) {
        ncj = (ncj * (n - j + 1)) / j;
        nxsets += ncj;
      }
      mLevelData[n].prepareLevelData(restricted, n, nxsets, mMaxDeg);
    }
  }

  protected boolean prune(final Graph graph, final int maxNodes) {
    return false;
  }

  protected boolean preprune(final Graph graph, final int maxNodes) {
    return false;
  }

  Graph makeCanon(final Graph g) throws IOException {
    final int[] lab = new int[MAXN];
    final int[] ptn = new int[MAXN];
    final int[] orbits = new int[MAXN];
    final OptionBlk options = new OptionBlk();

    options.mGetCanon = 1;

    return new Nauty(g, lab, ptn, null, orbits, options, mNautyStats, new long[50]).canon();
  }

  // decide if n in theta(g+x) -  version for n+1 < maxn
  private Graph accept1(final Graph g, final int x, final int[] deg, final boolean[] rigid) throws IOException {
    int i;
    final int[] lab = new int[MAXN];
    final int[] ptn = new int[MAXN];
    final int[] orbits = new int[MAXN];
    final int[] count = new int[MAXN];
    final int[] numcells = new int[1];
    final NautySet active = new NautySet(MAXM);
    final StatsBlk stats = new StatsBlk();
    final OptionBlk options = new OptionBlk();
    final long[] workspace = new long[50];
    final int n = g.order();
    final int nx = n + 1;
    final Graph gx = g.copy(nx);

    final int degn = Integer.bitCount(x);
    deg[n] = degn;

    int xw = x;
    while (xw != 0) {
      i = xNextBit(xw);
      xw ^= XBIT[i];
      gx.addEdge(n, i);
      ++deg[i];
    }

    if (preprune(gx, mMaxN)) {
      return null;
    }

    int i0 = 0;
    int i1 = n;
    for (i = 0; i < nx; ++i) {
      if (deg[i] == degn) {
        lab[i1--] = i;
      } else {
        lab[i0++] = i;
      }
      ptn[i] = 1;
    }
    ptn[n] = 0;
    active.set(0);
    if (i0 == 0) {
      numcells[0] = 1;
    } else {
      numcells[0] = 2;
      active.set(i1 + 1);
      ptn[i1] = 0;
    }
    final int code = RefineX.refineX(gx, lab, ptn, numcells, count, active, false);

    if (code < 0) {
      return null;
    }

    if (numcells[0] == nx) {
      rigid[0] = true;
      return gx;
    }

    options.mGetCanon = 1;
    options.mDefaultPtn = false;
    options.mUserAutomProc = new GenGraphsAutomProc(mLevelData);

    active.clear();
    new Nauty(gx, lab, ptn, active, orbits, options, stats, workspace);

    if (orbits[lab[n]] == orbits[n]) {
      rigid[0] = stats.mNumOrbits == nx;
      return gx;
    } else {
      return null;
    }
  }

  /* decide if n in theta(g+x)  --  version for n+1 < maxn */
  private Graph accept1b(final Graph g, final int x, final int[] deg, final boolean[] rigid, final MakeH makeh) throws IOException {
    final int[] lab = new int[MAXN];
    final int[] ptn = new int[MAXN];
    final int[] orbits = new int[MAXN];
    final int[] count = new int[MAXN];
    final int[] numcells = new int[1];
    final StatsBlk stats = new StatsBlk();
    final OptionBlk options = new OptionBlk();
    final long[] workspace = new long[50];
    final int n = g.order();
    final int nx = n + 1;
    final Graph gx = g.copy(nx);
    final int degn = Integer.bitCount(x);
    deg[n] = degn;

    int xw = x;
    while (xw != 0) {
      final int i = xNextBit(xw);
      xw ^= XBIT[i];
      gx.addEdge(n, i);
      ++deg[i];
    }

    if (preprune(gx, mMaxN)) {
      return null;
    }

    int i0 = 0;
    int i1 = n;
    for (int i = 0; i < nx; ++i) {
      if (deg[i] == degn) {
        lab[i1--] = i;
      } else {
        lab[i0++] = i;
      }
      ptn[i] = 1;
    }
    ptn[n] = 0;
    final NautySet active = new NautySet(MAXM);
    active.set(0);
    if (i0 == 0) {
      numcells[0] = 1;
    } else {
      numcells[0] = 2;
      active.set(i1 + 1);
      ptn[i1] = 0;
    }
    final int code = RefineX.refineX(gx, lab, ptn, numcells, count, active, false);
    if (code < 0) {
      return null;
    }

    final int[] h = new int[MAXN];
    makeh.makeH(gx, h);
    final int[] xx = mLevelData[nx].mXX;
    final int xubx = mLevelData[nx].mXub;

    xx[0] = 0;
    int kxx = 1;
    for (int v = 0; v < nx; ++v) {
      final int bitv = XBIT[v];
      final int hv = h[v];
      final int jxx = kxx;
      for (int ixx = 0; ixx < jxx; ++ixx) {
        if ((hv & xx[ixx]) == 0) {
          final int z = xx[ixx] | bitv;
          if (Integer.bitCount(z) <= xubx) {
            xx[kxx++] = z;
          }
        }
      }
    }
    mLevelData[nx].mXLim = kxx;

    if (numcells[0] == nx) {
      rigid[0] = true;
      return gx;
    }

    options.mGetCanon = 1;
    options.mDefaultPtn = false;
    options.mUserAutomProc = new GenGraphsAutomProcB(mLevelData);

    active.clear();
    new Nauty(gx, lab, ptn, active, orbits, options, stats, workspace);
    if (orbits[lab[n]] == orbits[n]) {
      rigid[0] = stats.mNumOrbits == nx;
      return gx;
    } else {
      return null;
    }
  }

  /* decide if n in theta(g+x)  --  version for n+1 == maxn */
  private Graph accept2(final Graph g, final int x, final int[] deg, final boolean nuniq) throws IOException {
    final int n = g.order();
    final int nx = n + 1;
    final Graph gx = g.copy(nx);
    final int[] degx = Arrays.copyOf(deg, nx);
    final int degn = Integer.bitCount(x);
    degx[n] = degn;
    int xw = x;
    while (xw != 0) {
      final int i = xNextBit(xw);
      xw ^= XBIT[i];
      gx.addEdge(n, i);
      ++degx[i];
    }
    if (preprune(gx, mMaxN)) {
      return null;
    }
    if (nuniq) {
      if (mCanonise) {
        mGCan = makeCanon(gx);
      }
      return gx;
    }
    final int[] lab = new int[MAXN];
    final int[] ptn = new int[MAXN];
    int i0 = 0;
    int i1 = n;
    for (int i = 0; i < nx; ++i) {
      lab[degx[i] == degn ? i1-- : i0++] = i;
      ptn[i] = 1;
    }
    ptn[n] = 0;
    final NautySet active = new NautySet(MAXM);
    active.set(0);
    final int[] numcells = new int[1];
    if (i0 == 0) {
      numcells[0] = 1;
      final int[] invar = new int[MAXN];
      if (!DistanceInvariant.distanceInvariant(gx, invar)) {
        return null;
      }
      final int qn = invar[n];
      int j0 = 0;
      int j1 = n;
      while (j0 <= j1) {
        final int j = lab[j0];
        if (invar[j] < qn) {
          ++j0;
        } else {
          lab[j0] = lab[j1];
          lab[j1--] = j;
        }
      }
      if (j0 > 0) {
        if (j0 == n) {
          if (mCanonise) {
            mGCan = makeCanon(gx);
          }
          return gx;
        }
        ptn[j1] = 0;
        ++numcells[0];
        active.set(j0);
      }
    } else {
      numcells[0] = 2;
      ptn[i1] = 0;
      active.set(i1 + 1);
      int vmax = 0;
      for (int i = i1 + 1; i < nx; ++i) {
        vmax |= BIT[lab[i]];
      }
      final int qn = (int) (long) Long.bitCount(((SmallGraph) gx).getEdgeVector(n) & vmax);
      int j0 = i1 + 1;
      int j1 = n;
      while (j0 <= j1) {
        final int j = lab[j0];
        final int qv = (int) (long) Long.bitCount(((SmallGraph) gx).getEdgeVector(j) & vmax);
        if (qv > qn) {
          return null;
        } else if (qv < qn) {
          ++j0;
        } else {
          lab[j0] = lab[j1];
          lab[j1--] = j;
        }
      }
      if (j0 > i1 + 1) {
        if (j0 == n) {
          if (mCanonise) {
            mGCan = makeCanon(gx);
          }
          return gx;
        }
        ptn[j1] = 0;
        ++numcells[0];
        active.set(j0);
      }
    }
    final int code = RefineX.refineX(gx, lab, ptn, numcells, new int[MAXN], active, true);
    if (code < 0) {
      return null;
    }
    boolean cheapacc = false;
    if (code > 0 || numcells[0] >= nx - 4) {
      cheapacc = true;
    } else if (numcells[0] == nx - 5) {
      int j1;
      for (j1 = nx - 2; j1 >= 0 && ptn[j1] > 0; --j1) {
      }
      if (nx - j1 != 5) {
        cheapacc = true;
      }
    } else {
      int j1 = nx;
      int j0 = 0;
      for (i1 = 0; i1 < nx; ++i1) {
        --j1;
        if (ptn[i1] > 0) {
          ++j0;
          while (ptn[++i1] > 0) {
          }
        }
      }
      if (j1 <= j0 + 1) {
        cheapacc = true;
      }
    }
    if (cheapacc) {
      if (mCanonise) {
        mGCan = makeCanon(gx);
      }
      return gx;
    }
    final OptionBlk options = new OptionBlk();
    options.mGetCanon = 1;
    options.mDefaultPtn = false;
    active.clear();
    final int[] orbits = new int[MAXN];
    mGCan = new Nauty(gx, lab, ptn, active, orbits, options, new StatsBlk(), new long[50]).canon();
    if (orbits[lab[n]] == orbits[n]) {
      if (mCanonise) {
        mGCan = makeCanon(gx);
      }
      return gx;
    }
    return null;
  }

  // find bounds on extension degree;  store answer in data[*].
  void xbnds(final int n, final int ne, final int dmax) {
    int xlb = n == 1 ? 0 : Math.max(dmax, (2 * ne + n - 2) / (n - 1));
    int xub = Math.min(n, mMaxDeg);

    for (int xc = xub; xc >= xlb; --xc) {
      int d = xc;
      int m = ne + d;
      for (int nn = n + 1; nn < mMaxN; ++nn) {
        final int t = (2 * m + nn - 2) / (nn - 1);
        if (d < t) {
          d = t;
        }
        m += d;
      }
      if (d > mMaxDeg || m > mMaxE) {
        xub = xc - 1;
      } else {
        break;
      }
    }

    if (ne + xlb < mMinE) {
      for (int xc = xlb; xc <= xub; ++xc) {
        int m = ne + xc;
        for (int nn = n + 1; nn < mMaxN; ++nn) {
          m += Math.min(mMaxDeg, nn);
        }
        if (m < mMinE) {
          xlb = xc + 1;
        } else {
          break;
        }
      }
    }

    mLevelData[n].mNe = ne;
    mLevelData[n].mDmax = dmax;
    mLevelData[n].mXlb = xlb;
    mLevelData[n].mXub = xub;
  }

  /* extend from n to n+1 -- version for restricted graphs */
  private void spaExtend(final Graph g, final int[] deg, final int ne, final boolean rigid, int xlb, final int xub, final MakeH makeh) throws IOException {
    final int n = g.order();
    mNodesByLevel[n]++;

    final int dmax = deg[n - 1];
    final int dcrit = mMinDeg - mMaxN + n;
    int d = 0;
    int dlow = 0;
    for (int i = 0; i < n; ++i) {
      if (deg[i] == dmax) {
        d |= XBIT[i];
      }
      if (deg[i] == dcrit) {
        dlow |= XBIT[i];
      }
    }

    if (xlb == dmax && Integer.bitCount(d) + dmax > n) {
      ++xlb;
    }
    final int nx = n + 1;
    if (nx == mMaxN && xlb < mMinDeg) {
      xlb = mMinDeg;
    }
    if (xlb > xub) {
      return;
    }

    if (prune(g, mMaxN)) {
      return;
    }

    final int[] xorb = mLevelData[n].mXOrb;
    final int[] xx = mLevelData[n].mXX;
    final int xlim = mLevelData[n].mXLim;

    if (nx == mMaxN) {
      for (int ixx = 0; ixx < xlim; ++ixx) {
        final int x = xx[ixx];
        final int xc = Integer.bitCount(x);
        if (xc < xlb || xc > xub) {
          continue;
        }
        if ((rigid || xorb[ixx] == ixx) && (xc > dmax || (xc == dmax && (x & d) == 0)) && (dlow & ~x) == 0) {
          final Graph gx = accept2(g, x, deg, xc > dmax + 1 || (xc == dmax + 1 && (x & d) == 0));
          if (gx != null && (mConnec == 0 || (mConnec == 1 && gx.isConnected()) || (mConnec > 1 && gx.isBiconnected()))) {
            if (!prune(gx, mMaxN)) {
              ++mEdgeCount[ne + xc];
              mOutProc.process(mCanonise ? mGCan : gx);
            }
          }
        }
      }
    } else {
      for (int ixx = 0; ixx < xlim; ++ixx) {
        if (nx == mSplitLevel) {
          if (mOdometer-- != 0) {
            continue;
          }
          mOdometer = mMod - 1;
        }
        final int x = xx[ixx];
        final int xc = Integer.bitCount(x);
        if (xc < xlb || xc > xub) {
          continue;
        }
        if ((rigid || xorb[ixx] == ixx) && (xc > dmax || (xc == dmax && (x & d) == 0)) && (dlow & ~x) == 0) {
          final int[] degx = Arrays.copyOf(deg, nx);
          if (mLevelData[nx].mNe != ne + xc || mLevelData[nx].mDmax != xc) {
            xbnds(nx, ne + xc, xc);
          }
          final int xlbx = mLevelData[nx].mXlb;
          final int xubx = mLevelData[nx].mXub;
          final boolean[] rigidx = new boolean[1];
          if (xlbx <= xubx) {
            final Graph gx = accept1b(g, x, degx, rigidx, makeh);
            if (gx != null) {
              spaExtend(gx, degx, ne + xc, rigidx[0], xlbx, xubx, makeh);
            }
          }
        }
      }
      if (n == mSplitLevel - 1 && n >= MIN_SPLIT_LEVEL && mNodesByLevel[n] >= sMultiplicity) {
        --mSplitLevel;
      }
    }
  }

  // extend from n to n+1 -- version for general graphs
  private void genExtend(final Graph g, final int[] deg, final int ne, final boolean rigid, int xlb, final int xub) throws IOException {

    final int n = g.order();
    mNodesByLevel[n]++;

    final int dmax = deg[n - 1];
    final int dcrit = mMinDeg - mMaxN + n;
    int d = 0;
    int dlow = 0;
    for (int i = 0; i < n; ++i) {
      if (deg[i] == dmax) {
        d |= XBIT[i];
      }
      if (deg[i] == dcrit) {
        dlow |= XBIT[i];
      }
    }

    if (xlb == dmax && Integer.bitCount(d) + dmax > n) {
      ++xlb;
    }
    final int nx = n + 1;
    if (nx == mMaxN && xlb < mMinDeg) {
      xlb = mMinDeg;
    }
    if (xlb > xub) {
      return;
    }

    if (prune(g, mMaxN)) {
      return;
    }

    final int imin = mLevelData[n].mXStart[xlb];
    final int imax = mLevelData[n].mXStart[xub + 1];
    final int[] xset = mLevelData[n].mXSet;
    final int[] xcard = mLevelData[n].mXCard;
    final int[] xorb = mLevelData[n].mXOrb;

    if (nx == mMaxN) {
      for (int i = imin; i < imax; ++i) {
        if (!rigid && xorb[i] != i) {
          continue;
        }
        final int x = xset[i];
        final int xc = xcard[i];
        if (xc == dmax && (x & d) != 0) {
          continue;
        }
        if ((dlow & ~x) != 0) {
          continue;
        }

        final Graph gx = accept2(g, x, deg, xc > dmax + 1 || (xc == dmax + 1 && (x & d) == 0));
        if (gx != null) {
          if (mConnec == 0 || (mConnec == 1 && gx.isConnected())
            || (mConnec > 1 && gx.isBiconnected())) {
            if (!prune(gx, mMaxN)) {
              ++mEdgeCount[ne + xc];
              mOutProc.process(mCanonise ? mGCan : gx);
            }
          }
        }
      }
    } else {
      for (int i = imin; i < imax; ++i) {
        if (!rigid && xorb[i] != i) {
          continue;
        }
        final int x = xset[i];
        final int xc = xcard[i];
        if (xc == dmax && (x & d) != 0) {
          continue;
        }
        if ((dlow & ~x) != 0) {
          continue;
        }
        if (nx == mSplitLevel) {
          if (mOdometer-- != 0) {
            continue;
          }
          mOdometer = mMod - 1;
        }

        final int[] degx = Arrays.copyOf(deg, nx);
        if (mLevelData[nx].mNe != ne + xc || mLevelData[nx].mDmax != xc) {
          xbnds(nx, ne + xc, xc);
        }
        final int xlbx = mLevelData[nx].mXlb;
        final int xubx = mLevelData[nx].mXub;
        if (xlbx > xubx) {
          continue;
        }

        mLevelData[nx].mLo = mLevelData[nx].mXStart[xlbx];
        mLevelData[nx].mHi = mLevelData[nx].mXStart[xubx + 1];
        final boolean[] rigidx = new boolean[1];
        final Graph gx = accept1(g, x, degx, rigidx);
        if (gx != null) {
          genExtend(gx, degx, ne + xc, rigidx[0], xlbx, xubx);
        }
      }
    }
    if (n == mSplitLevel - 1 && n >= MIN_SPLIT_LEVEL && mNodesByLevel[n] >= sMultiplicity) {
      --mSplitLevel;
    }
  }

  void setSplitLevel(final int splitLevelInc) {
    if (mMaxN >= 14 && mMod > 1) {
      mSplitLevel = mMaxN - 4;
    } else if (mMaxN >= 6 && mMod > 1) {
      mSplitLevel = mMaxN - 3;
    } else {
      mSplitLevel = -1;
    }

    if (mSplitLevel > 0) {
      mSplitLevel += splitLevelInc;
    }
    if (mSplitLevel > mMaxN - 1) {
      mSplitLevel = mMaxN - 1;
    }
    if (mSplitLevel < 3) {
      mSplitLevel = -1;
    }
  }

  /**
   * Return count of graphs by number of edges.
   * @return counts by edges.
   */
  public long[] edgeCounts() {
    return Arrays.copyOf(mEdgeCount, mEdgeCount.length);
  }

  void dumpEdgeCounts(final PrintStream out) {
    for (int i = 0; i <= mMaxE; ++i) {
      if (mEdgeCount[i] != 0) {
        out.println("> C " + mEdgeCount[i] + " graphs with " + i + " edges");
      }
    }
  }

  /**
   * Compute the total number of graphs in the run.
   * @return total number of graphs
   */
  public long totalCount() {
    long nout = 0;
    for (int i = 0; i <= mMaxE; ++i) {
      nout += mEdgeCount[i];
    }
    return nout;
  }

  public void setMinEdges(final int minE) {
    mMinE = minE;
  }

  public void setMaxDeg(final int maxDeg) {
    mMaxDeg = maxDeg;
  }

  public void setMinDeg(final int minDeg) {
    mMinDeg = minDeg;
  }

  public void setMaxEdges(final int maxE) {
    mMaxE = maxE;
  }

  public void setConnectionLevel(final int level) {
    mConnec = level;
  }

  public void setVertices(final int vertices) {
    mMaxN = vertices;
  }

  public void setProcessor(final GraphProcessor proc) {
    mOutProc = proc;
  }

  /** Sanitize the edge and degree constraints. */
  public void sanitizeParams() {
    if (mConnec == 1 && mMinDeg < 1 && mMaxN > 1) {
      mMinDeg = 1;
    }
    if (mConnec == 2 && mMinDeg < 2 && mMaxN > 2) {
      mMinDeg = 2;
    }
    if (mMaxDeg >= mMaxN) {
      mMaxDeg = mMaxN - 1;
    }
    if (mMaxE > mMaxN * mMaxDeg / 2) {
      mMaxE = mMaxN * mMaxDeg / 2;
    }
    if (mMaxDeg > mMaxE) {
      mMaxDeg = mMaxE;
    }
    if (mMinDeg < 0) {
      mMinDeg = 0;
    }
    if (mMinE < (mMaxN * mMinDeg + 1) / 2) {
      mMinE = (mMaxN * mMinDeg + 1) / 2;
    }
    if (mConnec != 0 && mMinE < mMaxN - 1) {
      mMinE = mMaxN - 2 + mConnec;
    }
  }

  /**
   * Run the graph search.
   * @param bipartite bipartite graphs only
   * @param squareFree square free graphs only
   * @param triangleFree triangle free graphs only
   * @param splitLevInc split level increment
   * @param res residue
   * @throws IOException if an I/O error occurs.
   */
  public void run(boolean bipartite, boolean squareFree, final boolean triangleFree, final int splitLevInc, final int res) throws IOException {
    final int[] deg = new int[1];
    boolean sparse = bipartite || squareFree || triangleFree;
    final Graph g1 = GraphFactory.create(1);
    if (mMaxN == 1) {
      if (res == 0) {
        ++mEdgeCount[0];
        mOutProc.process(g1);
      }
    } else {
      if (mMaxN > 28) {
        sparse = true;
      }
      if (mMaxN == mMaxE + 1 && mConnec != 0) {
        bipartite = true;
        squareFree = true;
        sparse = true;  /* trees */
      }
      makeLevelData(sparse);
      setSplitLevel(splitLevInc);

      mOdometer = res;

      //if (mMaxE >= mMinE && (mMod <= 1 || (mMod > 1 && (mSplitLevel > 2 || res == 0)))) {
      if (mMaxE >= mMinE && (mMod <= 1 || mSplitLevel > 2 || res == 0)) {
        xbnds(1, 0, 0);
        if (sparse) {
          mLevelData[1].mXX[0] = 0;
          if (mMaxDeg > 0) {
            mLevelData[1].mXX[1] = XBIT[0];
          }
          mLevelData[1].mXLim = mLevelData[1].mXub + 1;
        }

        if (bipartite) {
          if (squareFree) {
            spaExtend(g1, deg, 0, true, mLevelData[1].mXlb, mLevelData[1].mXub, new MakeBipartite6Graph());
          } else {
            spaExtend(g1, deg, 0, true, mLevelData[1].mXlb, mLevelData[1].mXub, new MakeBipartiteGraph());
          }
        } else if (triangleFree) {
          if (squareFree) {
            spaExtend(g1, deg, 0, true, mLevelData[1].mXlb, mLevelData[1].mXub, new MakeG5Graph());
          } else {
            spaExtend(g1, deg, 0, true, mLevelData[1].mXlb, mLevelData[1].mXub, new MakeXGraph());
          }
        } else if (squareFree) {
          spaExtend(g1, deg, 0, true, mLevelData[1].mXlb, mLevelData[1].mXub, new MakeSquareGraph());
        } else {
          genExtend(GraphFactory.create(1), new int[1], 0, true, mLevelData[1].mXlb, mLevelData[1].mXub);
        }
      }
    }
  }
}
