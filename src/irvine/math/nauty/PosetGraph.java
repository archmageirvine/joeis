package irvine.math.nauty;

import java.io.PrintStream;
import java.util.Arrays;

import irvine.math.graph.Graph;
import irvine.math.graph.GraphFactory;

/**
 * Generate posets. This is not as efficient as a deeper nauty implementation.
 * @author Sean A. Irvine
 */
public class PosetGraph implements GroupAction {

  private static final int MAXNV = 128;
  private static final int MAXNE = 1024;
  private static final int WORDSIZE = 64;
  private static final int MAXME = (2 * MAXNE + WORDSIZE - 1) / WORDSIZE;

  protected PrintStream mOut = null;

  private final int[] mV0 = new int[MAXNE];
  private final int[] mV1 = new int[MAXNE];
  private final int[][] mEdgeNo = new int[MAXNV][MAXNV];


  private final NautySet mX = new NautySet(MAXME);
  private final int[] mIx = new int[2 * MAXNE];
  private int mNix;
  private boolean mFirst;
  private int mNe;
  private final int[] mLastReject = new int[MAXNV];
  private boolean mLastRejOk;
  private int mRejectLevel;
  private long mGroupSize;

  /**
   * Function called for each poset as it is generated.
   * @param poset poset to process
   */
  protected void process(final Graph poset) {
  }

  /* test if x^p <= x */
  private boolean isMax(final int[] p, final int pos) {
    final NautySet px = new NautySet(mNe);

    for (int j = 0; j < mNix; ++j) {
      final int i = mIx[j];
      final int k = i >>> 1;
      if ((i & 1) == 1) {
        px.set(mEdgeNo[p[pos + mV1[k]]][p[pos + mV0[k]]]);
      } else {
        px.set(mEdgeNo[p[pos + mV0[k]]][p[pos + mV1[k]]]);
      }

      if (Long.compareUnsigned(px.getBlock(0), mX.getBlock(0)) > 0) {
        mRejectLevel = k;
        return false;
      }
    }

    mRejectLevel = MAXNE + 1;

    if (Long.compareUnsigned(px.getBlock(0), mX.getBlock(0)) < 0) {
      return true;
    }

    for (int i = 1; i < mNe; ++i) {
      if (Long.compareUnsigned(px.getBlock(i), mX.getBlock(i)) > 0) {
        return false;
      } else if (Long.compareUnsigned(px.getBlock(i), mX.getBlock(i)) < 0) {
        return true;
      }
    }
    return true;
  }


  @Override
  public void groupAction(final int[] p, final int pos, final int n, final int[] abort) {
    if (mFirst) {       /* only the identity */
      mFirst = false;
      return;
    }
    if (!isMax(p, pos)) {
      abort[0] = 1;
      System.arraycopy(p, pos, mLastReject, 0, n);
      mLastRejOk = true;
    }
  }

  private boolean dfs(final Graph g, final int v, final long neighbours) {
    if ((neighbours & (1L << v)) != 0) {
      return true;
    }
    for (int w = g.nextVertex(v, -1); w >= 0; w = g.nextVertex(v, w)) {
      if (dfs(g, w, neighbours)) {
        return true;
      }
    }
    return false;
  }

  private boolean isTransitiveReduced(final Graph g, final int u) {
    long neighbours = 0;
    for (int v = g.nextVertex(u, -1); v >= 0; v = g.nextVertex(u, v)) {
      neighbours |= 1L << v;
    }
    for (int v = g.nextVertex(u, -1); v >= 0; v = g.nextVertex(u, v)) {
      if (dfs(g, v, neighbours & ~(1L << v))) {
        return false;
      }
    }
    return true;
  }

  private boolean isPoset(final Graph g) {
    for (int u = 0; u < g.order(); ++u) {
      if (!isTransitiveReduced(g, u)) {
        return false;
      }
    }
    return true;
  }

  private int tryThisOne(final Graph poset, final GroupRecord group, final int ne) {
    mFirst = true;
    mNix = ne;

    final boolean accept;
    if (group == null || mGroupSize == 1) {
      accept = true;
    } else if (mLastRejOk && !isMax(mLastReject, 0)) {
      accept = false;
    } else if (mLastRejOk && mGroupSize == 2) {
      accept = true;
    } else {
      accept = NauGroup.allgroup2(group, this) == 0;
    }

    if (accept) {
      if (isPoset(poset)) {
        process(poset);
      }
      return MAXNE + 1;
    } else {
      return mRejectLevel;
    }
  }

  /* Update reflexive transitive closure with the new edge v->w.  Loops are essential for this to work. */
  private void updateTransitiveClosure(final Graph transitiveClosure, final int v, final int w) {
    for (int i = 0; i < transitiveClosure.order(); ++i) {
      if (transitiveClosure.isAdjacent(i, v)) {
        for (int q = transitiveClosure.nextVertex(w, -1); q >= 0; q = transitiveClosure.nextVertex(w, q)) {
          transitiveClosure.addEdge(i, q);
        }
      }
    }
  }

  private boolean isReduced(final Graph graph, final int w0, final int w1) {
    for (int u = 0; u < graph.order(); ++u) {
      if (graph.isAdjacent(u, w0) && graph.isAdjacent(u, w1)) {
        return false;
      }
    }
    return true;
  }

  /* This does part, but not all, of the work needed to determine posets. */
  private int scanPosets(final int level, final int ne, final int soFar, final Graph poset, final Graph transitiveClosure, final GroupRecord group) {

    if (level == ne) {
      return tryThisOne(poset, group, soFar);
    }

    final int w0 = mV0[level];
    final int w1 = mV1[level];

    if (!transitiveClosure.isAdjacent(w1, w0) && !transitiveClosure.isAdjacent(w0, w1)) {
      int k = 2 * level;        /* edge w0->w1 */
      if (isReduced(poset, w0, w1)) {
        mX.set(k);
        mIx[soFar] = k;
        poset.addEdge(w0, w1);
        final Graph newtc1 = transitiveClosure.copy();
        updateTransitiveClosure(newtc1, w0, w1);
        final int retlev1 = scanPosets(level + 1, ne, soFar + 1, poset, newtc1, group);
        poset.removeEdge(w0, w1);
        mX.clear(k);
        if (retlev1 < level) {
          return retlev1;
        }
      }

      if (isReduced(poset, w1, w0)) {
        k = 2 * level + 1;      /* edge w1->w0 */
        mX.set(k);
        mIx[soFar] = k;
        poset.addEdge(w1, w0);
        final Graph newtc2 = transitiveClosure.copy();
        updateTransitiveClosure(newtc2, w1, w0);
        final int retlev2 = scanPosets(level + 1, ne, soFar + 1, poset, newtc2, group);
        poset.removeEdge(w1, w0);
        mX.clear(k);
        if (retlev2 < level) {
          return retlev2;
        }
      }
    }

    return level - 1;
  }

  /**
   * Generate all possible digraphs from the given graph subject to constraints.
   * @param g graph
   * @param nFixed fixed points
   * @param minArcs minimum number of edges
   * @param maxArcs maximum number of edges
   */
  public void generate(final Graph g, final int nFixed, final int minArcs, final int maxArcs) {
    final int n = g.order();
    final int[] lab = new int[MAXNV];
    final int[] ptn = new int[MAXNV];
    final int[] orbits = new int[MAXNV];

    int j0 = -1;  /* last vertex with degree 0 */
    int j1 = n;   /* first vertex with degree > 0 */

    int ne = 0;
    for (int i = 0; i < n; ++i) {
      final int deg = (int) g.degree(i);
      if (deg == 0) {
        lab[++j0] = i;
      } else {
        lab[--j1] = i;
      }
      ne += deg;
    }
    ne /= 2;

    mNe = Math.max(1, (2 * ne + WORDSIZE - 1) / WORDSIZE);
    mX.clear();

    if (ne == 0 && minArcs <= 0) {
      tryThisOne(GraphFactory.createDigraph(n), null, 0);
      return;
    }

    if (maxArcs < ne || minArcs > ne) {
      return;
    }

    if (n > MAXNV || ne > MAXNE) {
      throw new RuntimeException("MAXNV or MAXNE exceeded");
    }

    Arrays.fill(ptn, 0, n, 1);
    ptn[n - 1] = 0;
    final NautySet active = new NautySet((MAXNV + WORDSIZE - 1) / WORDSIZE);
    active.set(0);

    for (int i = 0; i <= j0; ++i) {
      if (i < n - 1) {
        active.set(i + 1);
      }
      ptn[i] = 0;
    }

    int i;
    for (i = j0 + 1; i < n; ++i) {
      if (lab[i] < nFixed) {
        break;
      }
    }
    if (i != j0 + 1 && i != n) {
      ptn[i - 1] = 0;
      active.set(i);
    }

    final OptionBlk options = new OptionBlk();
    final StatsBlk stats = new StatsBlk();
    final NauGroup ng = new NauGroup();
    options.mDefaultPtn = false;
    options.mUserAutomProc = ng;
    options.mUserLevelProc = ng;

    new Nauty(g, lab, ptn, active, orbits, options, stats, new long[100]);

    mGroupSize = stats.groupSize().longValueExact();

    final GroupRecord group = ng.groupPtr(false);
    ng.makeCosetReps(group);

    int k = 0;
    for (i = 0; i < n; ++i) {
      for (int j = i; (j = g.nextVertex(i, j)) >= 0; ) {
        mV0[k] = i;
        mV1[k] = j;
        mEdgeNo[i][j] = 2 * k;
        mEdgeNo[j][i] = 2 * k + 1;
        ++k;
      }
    }

    mLastRejOk = false;

    final Graph tc = GraphFactory.createDigraph(n);
    for (int j = 0; j < n; ++j) {
      tc.addEdge(j, j); // reflexive
    }
    scanPosets(0, ne, 0, GraphFactory.createDigraph(n), tc, group);
  }
}
