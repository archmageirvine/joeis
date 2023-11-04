package irvine.oeis.a030;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A030084 Primes such that digits of p^3 appear in p.
 * @author Sean A. Irvine
 */
public class A030084 extends A000040 {

  {
    setOffset(1);
  }

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      if (A030079.isOk(p.pow(3), p)) {
        return p;
      }
    }
  }
}
