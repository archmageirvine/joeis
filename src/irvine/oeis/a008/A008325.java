package irvine.oeis.a008;

import irvine.math.nauty.GenerateGraphs;
import irvine.math.z.Z;
import irvine.oeis.Sequence3;

/**
 * A008325 Number of simple regular trivalent bipartite graphs with 2n nodes.
 * @author Sean A. Irvine
 */
public class A008325 extends Sequence3 {

  private int mN = 4;

  @Override
  public Z next() {
    mN += 2;
    final GenerateGraphs gg = new GenerateGraphs(1);
    gg.setVertices(mN);
    gg.setMinEdges(0);
    gg.setMaxEdges(mN * (mN - 1) / 2);
    gg.setMinDeg(3);
    gg.setMaxDeg(3);
    gg.sanitizeParams();
    gg.run(true /* bipartite */, false, false, 0, 0);
    return Z.valueOf(gg.totalCount());
  }
}
