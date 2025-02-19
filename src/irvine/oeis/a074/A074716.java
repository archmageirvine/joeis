package irvine.oeis.a074;

import irvine.math.z.Z;
import irvine.oeis.a000.A000045;

/**
 * A074716 Numbers k such that 2^k - F(k) is prime, where F(n) is the n-th Fibonacci number.
 * @author Sean A. Irvine
 */
public class A074716 extends A000045 {

  private Z mA = Z.ONE;
  private long mN = -1;

  @Override
  public Z next() {
    while (true) {
      final Z f = super.next();
      if (++mN > 0) {
        mA = mA.multiply2();
      }
      if (mA.subtract(f).isProbablePrime()) {
        return Z.valueOf(mN);
      }
    }
  }
}
