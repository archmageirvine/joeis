package irvine.oeis.a051;

import irvine.math.graph.Graph;
import irvine.math.nauty.GenerateGraphs;
import irvine.math.z.Z;
import irvine.oeis.ParallelGenerateGraphsSequence;
import irvine.oeis.Sequence;

/**
 * A051031 Triangle read by rows: T(n,r) is the number of not necessarily connected r-regular graphs with n nodes, 0 &lt;= r &lt; n.
 * @author Sean A. Irvine
 */
public class A051031 implements Sequence {

  // Uses direct enumeration -- better methods are known

  private int mV = 0;
  private int mM = 0;

  @Override
  public Z next() {
    if (++mM >= mV) {
      ++mV;
      mM = 0;
    }
    if (((mV * mM) & 1) == 1) {
      return Z.ZERO; // impossible for a graph like this
    }
    return new ParallelGenerateGraphsSequence(mV - 1, 0, false, false, false) {
      @Override
      protected long getCount(final Graph graph) {
        return 1;
      }

      @Override
      protected void graphGenInit(final GenerateGraphs gg) {
        gg.setVertices(mN);
        gg.setMinEdges(mN * mM / 2);
        gg.setMaxEdges(mN * mM / 2);
        gg.setMinDeg(mM);
        gg.setMaxDeg(mM);
        gg.setConnectionLevel(0);
      }
    }.next();
  }
}
