package irvine.oeis.a005;

import irvine.math.nauty.GenerateGraphs;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A005176 Number of regular graphs with n unlabeled nodes.
 * @author Sean A. Irvine
 */
public class A005176 implements Sequence {

  private int mN = -1;

  protected int connectionLevel() {
    return 0;
  }

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ONE;
    }
    Z res = Z.ZERO;
    for (int k = 0; k < mN; ++k) {
      final GenerateGraphs gg = new GenerateGraphs(1);
      gg.setVertices(mN);
      gg.setMinEdges(0);
      gg.setMaxEdges(mN * (mN - 1) / 2);
      gg.setConnectionLevel(connectionLevel());
      gg.setMinDeg(k);
      gg.setMaxDeg(k);
      gg.sanitizeParams();
      gg.run(false, false, false, 0, 0);
      res = res.add(gg.totalCount());
    }
    return res;
  }
}

