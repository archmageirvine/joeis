package irvine.oeis.a392;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.a002.A002808;

/**
 * A392484 Composite numbers k such that binomial(11*k, k) == 11^k (mod k).
 * @author Sean A. Irvine
 */
public class A392484 extends A002808 {

  private static final Z Z11 = Z.valueOf(11);

  private boolean is(final Z k) {
    return Binomial.binomial(k.multiply(11), k, k).equals(Z11.modPow(k, k));
  }

  @Override
  public Z next() {
    while (true) {
      final Z c = super.next();
      if (is(c)) {
        return c;
      }
    }
  }
}
