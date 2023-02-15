package irvine.oeis.a061;

import irvine.math.z.Z;
import irvine.oeis.a028.A028846;

/**
 * A061426 Geometric mean of the digits = 2. In other words, the product of the digits is = 2^k where k is the number of digits.
 * @author Sean A. Irvine
 */
public class A061426 extends A028846 {

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
      if (prod.equals(Z.ONE.shiftLeft(digits))) {
        return s;
      }
    }
  }
}

