package irvine.oeis.a030;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A030080 Primes such that digits of p appear in p^3.
 * @author Sean A. Irvine
 */
public class A030080 extends A000040 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      if (A030079.isOk(p, p.pow(3))) {
        return p;
      }
    }
  }
}
