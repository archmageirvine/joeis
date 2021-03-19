package irvine.oeis.a045;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A045707 Primes with first digit 1.
 * @author Sean A. Irvine
 */
public class A045707 extends A000040 {

  protected String prefix() {
    return "1";
  }

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      if (p.toString().startsWith(prefix())) {
        return p;
      }
    }
  }
}
