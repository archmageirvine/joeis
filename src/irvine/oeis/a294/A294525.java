package irvine.oeis.a294;

import java.util.Arrays;

import irvine.math.function.Functions;
import irvine.math.graph.Graph;
import irvine.math.nauty.GenerateGraphs;
import irvine.math.nauty.GraphProcessor;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.string.StringUtils;

/**
 * A294525 Triangle read by rows: T(n,k) is the number of connected graphs on n nodes with k center nodes.
 * @author Sean A. Irvine
 */
public class A294525 extends Sequence1 implements GraphProcessor {

  private final boolean mVerbose = "true".equals(System.getProperty("oeis.verbose"));
  private int mN = 0;
  private int mM = 0;
  protected long[] mCount = null;

  private int max(final Graph graph, final int v) {
    return Functions.MAX.i(graph.distanceVector(v));
  }

  @Override
  public void process(final Graph graph) {
    int min = graph.order();
    int cnt = 0;
    for (int v = 0; v < graph.order(); ++v) {
      final int max = max(graph, v);
      if (max <= min) {
        if (max < min) {
          min = max;
          cnt = 1;
        } else {
          ++cnt;
        }
      }
    }
    ++mCount[cnt];
  }

  protected void step() {
    final GenerateGraphs gg = new GenerateGraphs(1);
    gg.setConnectionLevel(1);
    gg.setVertices(++mN);
    gg.setMinEdges(mN - 1);
    gg.setMaxEdges(mN * (mN - 1));
    gg.setProcessor(this);
    gg.sanitizeParams();
    mCount = new long[mN + 1]; // index 0 not used
    gg.run(false, false, false, 0, 0);
    if (mVerbose) {
      StringUtils.message(Arrays.toString(mCount));
    }
  }

  @Override
  public Z next() {
    if (++mM > mN) {
      step();
      mM = 1;
    }
    return Z.valueOf(mCount[mM]);
  }

}

