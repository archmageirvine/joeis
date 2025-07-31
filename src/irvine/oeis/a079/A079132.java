package irvine.oeis.a079;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A079132 Primes such that iterated sum-of-digits (A038194) is even.
 * @author Sean A. Irvine
 */
public class A079132 extends A000040 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      if ((p.mod(9) & 1) == 0) {
        return p;
      }
    }
  }
}

