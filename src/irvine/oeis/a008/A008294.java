package irvine.oeis.a008;

import irvine.math.z.Z;
import irvine.oeis.a104.A104035;

/**
 * A008294 Triangle of coefficients in expansion of D^n (sec x) / sec x in powers of tan x.
 * @author Sean A. Irvine
 */
public class A008294 extends A104035 {

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
