package irvine.oeis.a010;

import irvine.math.cr.Convergents;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A010340 Sum of terms in period of continued fraction for sqrt(n).
 * @author Sean A. Irvine
 */
public class A010340 implements Sequence {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    Z sum = Z.ZERO;
    mN = mN.add(1);
    if (!mN.isSquare()) {
      boolean first = true;
      for (final Z c : Convergents.continuedFractionConvergentsSqrt(mN.longValueExact())) {
        if (first) {
          first = false;
        } else {
          sum = sum.add(c);
        }
      }
    }
    return sum;
  }
}
