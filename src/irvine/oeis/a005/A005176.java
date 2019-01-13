package irvine.oeis.a005;

import java.io.IOException;

import irvine.math.nauty.GenerateGraphs;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A005176.
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
      try {
        gg.run(false, false, false, 0, 0);
      } catch (final IOException e) {
        throw new RuntimeException(e); // We are not generating output anyway
      }
      res = res.add(gg.totalCount());
    }
    return res;
  }
}

