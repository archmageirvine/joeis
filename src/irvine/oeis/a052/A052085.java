package irvine.oeis.a052;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A052085 Primes whose decimal digits are grouped together.
 * @author Sean A. Irvine
 */
public class A052085 extends A000040 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      if (A052081.isDigitsGrouped(p)) {
        return p;
      }
    }
  }
}

