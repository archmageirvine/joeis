package irvine.oeis.a058;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A058885 a(n) = smallest k such that k! ends in 2^n, not counting the trailing zeros.
 * @author Sean A. Irvine
 */
public class A058885 extends Sequence0 {

  private Z mA = null;
  private Z mB = Z.TEN;
  private Z mC = Z.TEN;

  @Override
  public Z next() {
    mA = mA == null ? Z.ONE : mA.multiply2();
    if (mA.compareTo(mB) >= 0) {
      mB = mB.multiply(10);
      mC = mB.multiply(100);
    }
    Z f = Z.ONE;
    long k = 0;
    while (!f.mod(mB).equals(mA)) {
      f = f.multiply(++k);
      while (f.mod(10) == 0) {
        f = f.divide(10);
      }
      f = f.mod(mC);
    }
    return Z.valueOf(k);
  }
}
