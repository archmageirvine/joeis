package irvine.oeis.a030;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A030145 Primes such that in p^2 the parity of digits alternates.
 * @author Sean A. Irvine
 */
public class A030145 extends A000040 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      if (A030141.isOk(p.square())) {
        return p;
      }
    }
  }
}
