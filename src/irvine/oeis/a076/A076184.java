package irvine.oeis.a076;

import java.util.HashSet;

import irvine.math.function.Functions;
import irvine.math.graph.Graph;
import irvine.math.graph.GraphFactory;
import irvine.math.nauty.Nauty;
import irvine.math.nauty.NautySet;
import irvine.math.nauty.OptionBlk;
import irvine.math.nauty.StatsBlk;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A076184 Graph code numbers of simple graphs in numerical order.
 * @author Sean A. Irvine
 */
public class A076184 extends Sequence1 {

  private long mCode = -1;
  private final HashSet<Graph> mSeen = new HashSet<>();
  private final long[] mWorkspace = new long[100];
  private int[] mLab = {};
  private int[] mPtn = {};
  private int[] mOrb = {};
  private NautySet mNautySet = new NautySet(0);
  private final StatsBlk mStatsBlk = new StatsBlk();
  private final OptionBlk mOpt = new OptionBlk();
  {
    mOpt.setCanon(1);
  }

  private boolean is(final long code) {
    final int n = (Functions.SQRT.i(8 * Functions.DIGIT_LENGTH.i(2, code) - 7) + 1) / 2 + 1;
    final Graph g = GraphFactory.create(n);
    // Convert the potential code into a graph
    long b = 1;
    for (int u = 1; u < n; ++u) {
      for (int v = 0; v < u; ++v, b <<= 1) {
        if ((code & b) != 0) {
          g.addEdge(u, v);
        }
      }
    }
    //System.out.println(code + " " + Long.toBinaryString(code) + " " + n + " " + g);
    if (n > 1) {
      for (int k = 0; k < n; ++k) {
        if (g.degree(k) == 0) {
          return false; // ignore graphs with isolated vertices
        }
      }
    }
    if (n != mLab.length) {
      mSeen.clear(); // No longer need to remember graphs with less vertices
      mLab = new int[n];
      mPtn = new int[n];
      mOrb = new int[n];
      mNautySet = new NautySet(n);
    }
    // Use nauty to canonicalize and check if this is a new graph not yet seen
    return mSeen.add(new Nauty(g, mLab, mPtn, mNautySet, mOrb, mOpt, mStatsBlk, mWorkspace).canon());
  }

  @Override
  public Z next() {
    while (true) {
      if (is(++mCode)) {
        return Z.valueOf(mCode);
      }
    }
  }
}
