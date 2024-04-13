package irvine.oeis.a064;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.a000.A000040;

/**
 * A064155 Let p = x1x2x3...xk be a prime in base 10 with k digits. The sequence gives the primes p such that x1*x2*x3*...xk = k*(x1 + x2 + x3 + ... + xk).
 * @author Sean A. Irvine
 */
public class A064155 extends A000040 {

  private long mDigits = 1;
  private Z mLimit = Z.TEN;

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      if (p.compareTo(mLimit) >= 0) {
        mLimit = mLimit.multiply(10);
        ++mDigits;
      }
      if (ZUtils.digitProduct(p).equals(Z.valueOf(Functions.DIGIT_SUM.l(p)).multiply(mDigits))) {
        return p;
      }
    }
  }
}
