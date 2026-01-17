package irvine.oeis.a080;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.a002.A002808;

/**
 * A080469 Composite numbers k such that binomial(3*k, k) == 3^k (mod k).
 * @author Sean A. Irvine
 */
public class A080469 extends A002808 {

  @Override
  public Z next() {
    while (true) {
      final Z c = super.next();
      if (Binomial.binomial(c.multiply(3), c, c).equals(Z.THREE.modPow(c, c))) {
        return c;
      }
    }
  }
}

