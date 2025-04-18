package irvine.oeis.a054;

import irvine.math.graph.Graph;
import irvine.math.nauty.GenerateGraphs;
import irvine.math.nauty.GraphProcessor;
import irvine.math.nauty.Nauty;
import irvine.math.nauty.NautySet;
import irvine.math.nauty.OptionBlk;
import irvine.math.nauty.StatsBlk;
import irvine.math.z.Z;
import irvine.oeis.Sequence3;

/**
 * A054594 Number of labeled minimally 2-connected graphs by nodes.
 * @author Sean A. Irvine
 */
public class A054594 extends Sequence3 implements GraphProcessor {

  // This works but is really slow, cf. A003317

  private int mN = 2;
  private Z mCount = Z.ZERO;
  private final long[] mWorkspace = new long[100];
  private int[] mLab;
  private int[] mPtn;
  private int[] mOrb;
  private NautySet mSet;
  private Z mFactorial = Z.TWO;
  private final OptionBlk mOptions = new OptionBlk();
  {
    mOptions.setCanon(1);
  }

  @Override
  public void process(final Graph graph) {
    if (graph.isMinimallyBiconnected()) {
      // Number of labellings is |V|! / |Aut(graph)|
      final StatsBlk stats = new StatsBlk();
      new Nauty(graph, mLab, mPtn, mSet, mOrb, mOptions, stats, mWorkspace);
      mCount = mCount.add(mFactorial.divide(stats.groupSize()));
    }
  }

  @Override
  public Z next() {
    mFactorial = mFactorial.multiply(++mN);
    final GenerateGraphs gg = new GenerateGraphs(1);
    gg.setConnectionLevel(2); // biconnected
    gg.setVertices(mN);
    gg.setMinEdges(mN);
    gg.setMaxEdges(mN * (mN - 1));
    gg.setProcessor(this);
    gg.sanitizeParams();
    mLab = new int[mN];
    mPtn = new int[mN];
    mOrb = new int[mN];
    mSet = new NautySet(mN);
    mCount = Z.ZERO;
    gg.run(0, 0, 0);
    return mCount;
  }

}

