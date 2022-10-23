package irvine.oeis.a046;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A046431 Sum of digits of a(n) raised to its digits powers is prime.
 * @author Sean A. Irvine
 */
public class A046431 extends Sequence0 {

  private long mN = 9;

  private boolean is(long n) {
    Z sum = Z.ZERO;
    while (n != 0) {
      final long r = n % 10;
      n /= 10;
      sum = sum.add(LongUtils.pow(r, r));
    }
    return sum.isProbablePrime();
  }

  @Override
  public Z next() {
    while (!is(++mN)) {
      // do nothing
    }
    return Z.valueOf(mN);
  }
}
