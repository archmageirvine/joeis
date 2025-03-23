package irvine.oeis.a014;

import irvine.math.nauty.GenerateGraphs;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A014371 Number of trivalent connected simple graphs with 2n nodes and girth at least 4.
 * @author Sean A. Irvine
 */
public class A014371 extends Sequence0 {

  private int mN = -2;

  @Override
  public Z next() {
    mN += 2;
    if (mN == 0) {
      return Z.ONE;
    }
    final GenerateGraphs gg = new GenerateGraphs(1);
    gg.setConnectionLevel(1);
    gg.setVertices(mN);
    gg.setMinEdges(3 * mN / 2);
    gg.setMaxEdges(3 * mN / 2);
    gg.setMinDeg(3);
    gg.setMaxDeg(3);
    gg.sanitizeParams();
    gg.run(GenerateGraphs.TRIANGLE_FREE, 0, 0);
    return Z.valueOf(gg.totalCount());
  }
}

