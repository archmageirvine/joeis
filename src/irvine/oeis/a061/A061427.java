package irvine.oeis.a061;

import irvine.math.z.Z;
import irvine.oeis.a174.A174813;

/**
 * A061427 Geometric mean of the digits = 3. In other words, the product of the digits is = 3^k where k is the number of digits.
 * @author Sean A. Irvine
 */
public class A061427 extends A174813 {

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
      if (prod.equals(Z.THREE.pow(digits))) {
        return s;
      }
    }
  }
}

