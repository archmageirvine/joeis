package irvine.oeis.a006;

import irvine.math.nauty.GenerateGraphs;
import irvine.math.z.Z;
import irvine.oeis.Sequence3;

/**
 * A006823 Number of connected trivalent bipartite graphs with 2n nodes.
 * @author Sean A. Irvine
 */
public class A006823 extends Sequence3 {

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
    gg.setConnectionLevel(1);
    gg.sanitizeParams();
    gg.run(true /* bipartite */, false, false, 0, 0);
    return Z.valueOf(gg.totalCount());
  }
}
