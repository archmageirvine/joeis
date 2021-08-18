package irvine.oeis.a031;

import java.util.List;

import irvine.math.cr.Convergents;
import irvine.math.z.Z;

/**
 * A031415 Numbers k such that the continued fraction for sqrt(k) has odd period and if the last term of the periodic part is deleted then there are a pair of central terms both equal to 2.
 * @author Sean A. Irvine
 */
public class A031415 extends A031414 {

  private Z mN = Z.ZERO;

  @Override
  protected Z target() {
    return Z.TWO;
  }

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      if (!mN.isSquare()) {
        final List<Z> conv = Convergents.continuedFractionConvergentsSqrt(mN.longValueExact());
        final int s = conv.size();
        if ((s & 1) == 0
          && target().equals(conv.get(s / 2))
          && target().equals(conv.get(s / 2 - 1))) {
          return mN;
        }
      }
    }
  }
}
