package irvine.oeis.a064;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A064155 Primes whose product of digits equals the number of digits times the sum of digits.
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
      if (Functions.DIGIT_PRODUCT.z(p).equals(Functions.DIGIT_SUM.z(p).multiply(mDigits))) {
        return p;
      }
    }
  }
}
