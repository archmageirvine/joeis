package irvine.oeis.a046;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A046440 Sum of digits of prime(n) raised to its digits' powers is prime.
 * @author Sean A. Irvine
 */
public class A046440 extends A000040 {

  {
    setOffset(0);
  }

  private boolean is(Z n) {
    Z sum = Z.ZERO;
    while (!n.isZero()) {
      final Z[] qr = n.divideAndRemainder(Z.TEN);
      final long r = qr[1].longValue();
      n = qr[0];
      sum = sum.add(LongUtils.pow(r, r));
    }
    return sum.isProbablePrime();
  }

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      if (is(p)) {
        return p;
      }
    }
  }
}
