package irvine.oeis.a030;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A030092 Primes such that p and p^3 have same digits.
 * @author Sean A. Irvine
 */
public class A030092 extends A000040 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      if (A030091.isOk(p, p.pow(3))) {
        return p;
      }
    }
  }
}
