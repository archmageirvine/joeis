package irvine.oeis.a061;

import irvine.math.z.Z;
import irvine.oeis.a028.A028846;

/**
 * A061428 Geometric mean of the digits = 4. In other words, the product of the digits is = 4^k where k is the number of digits.
 * @author Sean A. Irvine
 */
public class A061428 extends A028846 {

  @Override
  public Z next() {
    while (true) {
      final Z s = super.next();
      Z t = s;
      Z prod = Z.ONE;
      int digits = 0;
      while (!t.isZero()) {
        prod = prod.multiply(t.mod(10));
        t = t.divide(10);
        ++digits;
      }
      if (prod.equals(Z.ONE.shiftLeft(2L * digits))) {
        return s;
      }
    }
  }
}

