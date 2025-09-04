package irvine.oeis.a080;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A080115 Primes not in A080114.
 * @author Sean A. Irvine
 */
public class A080115 extends A000040 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      if (!A080114.is(p.longValueExact())) {
        return p;
      }
    }
  }
}
