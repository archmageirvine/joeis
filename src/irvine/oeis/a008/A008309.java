package irvine.oeis.a008;

import irvine.math.z.Z;
import irvine.oeis.a049.A049218;

/**
 * A008309 Triangle <code>T(n,k)</code> of arctangent numbers: expansion of arctan(x)^n/n!.
 * @author Sean A. Irvine
 */
public class A008309 extends A049218 {

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
