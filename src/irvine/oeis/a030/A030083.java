package irvine.oeis.a030;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A030083 Primes such that digits of p^2 appear in p.
 * @author Sean A. Irvine
 */
public class A030083 extends A000040 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      if (A030079.isOk(p.square(), p)) {
        return p;
      }
    }
  }
}
