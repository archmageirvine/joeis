package irvine.oeis.a082;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A082885 Primes followed by a larger-than-average prime gap.
 * @author Sean A. Irvine
 */
public class A082885 extends A000040 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      if (CR.valueOf(mPrime.nextPrime(p).subtract(p)).compareTo(CR.valueOf(p).log()) > 0) {
        return p;
      }
    }
  }
}
