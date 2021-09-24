package irvine.oeis.a031;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A031930 Lower prime of a difference of 12 between consecutive primes.
 * @author Sean A. Irvine
 */
public class A031930 extends A000040 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      if (mPrime.nextPrime(p).equals(p.add(12))) {
        return p;
      }
    }
  }
}
