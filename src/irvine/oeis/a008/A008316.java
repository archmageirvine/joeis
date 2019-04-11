package irvine.oeis.a008;

import irvine.math.z.Z;
import irvine.oeis.a100.A100258;

/**
 * A008316 Triangle of coefficients of Legendre polynomials P_n <code>(x)</code>.
 * @author Sean A. Irvine
 */
public class A008316 extends A100258 {

  @Override
  public Z next() {
    while (true) {
      final Z t = super.next();
      if (!Z.ZERO.equals(t)) {
        return t;
      }
    }
  }
}
