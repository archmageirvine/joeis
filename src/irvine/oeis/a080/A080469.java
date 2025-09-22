package irvine.oeis.a080;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.a002.A002808;

/**
 * A080469 Composite n such that binomial(3*n,n)==3^n (mod n).
 * @author Sean A. Irvine
 */
public class A080469 extends A002808 {

  // This could be made better with a proper implementation of Binomial.binomial(n, k, mod).

  @Override
  public Z next() {
    while (true) {
      final Z c = super.next();
      if (Binomial.binomial(c.multiply(3), c).mod(c).equals(Z.THREE.modPow(c, c))) {
        return c;
      }
    }
  }
}

