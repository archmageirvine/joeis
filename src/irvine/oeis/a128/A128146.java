package irvine.oeis.a128;

import irvine.math.z.Z;
import irvine.oeis.a000.A000330;

/**
 * A128146 Numerators of Hankel transform of 1/J(n+1), where J(n)=A001045(n).
 * @author Sean A. Irvine
 */
public class A128146 extends A000330 {

  @Override
  public Z next() {
    final Z shift = super.next();
    if (shift.bitLength() > 30) {
      throw new UnsupportedOperationException();
    }
    final Z r = Z.ONE.shiftLeft(shift.longValue());
    final long sign = (mN * (mN + 1) / 2) & 1;
    return sign == 0 ? r : r.negate();
  }
}
