package irvine.oeis.a066;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a000.A000720;

/**
 * A066457 Numbers n such that product of factorials of digits of n equals pi(n) (A000720).
 * @author Sean A. Irvine
 */
public class A066457 extends A000720 {

  private long mN = 0;

  private Z factorialDigitProduct(long n) {
    Z prod = Z.ONE;
    while (n != 0) {
      prod = prod.multiply(Functions.FACTORIAL.l(n % 10));
      n /= 10;
    }
    return prod;
  }

  @Override
  public Z next() {
    while (true) {
      final Z pi = super.next();
      if (factorialDigitProduct(++mN).equals(pi)) {
        return Z.valueOf(mN);
      }
    }
  }
}

