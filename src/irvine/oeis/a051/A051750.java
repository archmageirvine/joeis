package irvine.oeis.a051;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.a000.A000040;

/**
 * A051750 Primes whose cubes lack zeros.
 * @author Sean A. Irvine
 */
public class A051750 extends A000040 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      if (!ZUtils.containsZero(p.pow(3))) {
        return p;
      }
    }
  }
}

