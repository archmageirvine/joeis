package irvine.oeis.a006;

import irvine.math.graph.Graph;
import irvine.math.nauty.GenerateGraphs;
import irvine.math.nauty.GraphProcessor;
import irvine.math.nauty.Nauty;
import irvine.math.nauty.NautySet;
import irvine.math.nauty.OptionBlk;
import irvine.math.nauty.StatsBlk;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A006714 Number of trivalent bipartite labeled graphs with 2n labeled nodes.
 * @author Sean A. Irvine
 */
public class A006714 implements Sequence, GraphProcessor {

  private int mN = 4;
  private Z mFactorial = Z.valueOf(24);
  private Z mCount = Z.ZERO;

  // Reusable workspaces for nauty
  private final long[] mWorkspace = new long[100];
  private final OptionBlk mOptions = new OptionBlk();
  private int[] mLab;
  private int[] mPtn;
  private int[] mOrb;
  private NautySet mSet;

  @Override
  public void process(final Graph graph) {
    // Number of labellings is |V|! / |Aut(graph)|
    final StatsBlk stats = new StatsBlk();
    new Nauty(graph, mLab, mPtn, mSet, mOrb, mOptions, stats, mWorkspace);
    mCount = mCount.add(mFactorial.divide(stats.groupSize()));
  }

  protected int connectionLevel() {
    return 0;
  }

  @Override
  public Z next() {
    mN += 2;
    mFactorial = mFactorial.multiply(mN).multiply(mN - 1);
    mCount = Z.ZERO;
    final GenerateGraphs gg = new GenerateGraphs(1);
    gg.setConnectionLevel(connectionLevel());
    gg.setVertices(mN);
    gg.setMaxDeg(3);
    gg.setMinDeg(3);
    gg.setMinEdges(3 * mN / 2);
    gg.setMaxEdges(3 * mN / 2);
    gg.setProcessor(this);
    gg.sanitizeParams();
    mLab = new int[mN];
    mPtn = new int[mN];
    mOrb = new int[mN];
    mSet = new NautySet(mN);
    gg.run(true, false, false, 0, 0);
    return mCount;
  }
}
