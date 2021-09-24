package irvine.oeis.a031;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A031926 Lower prime of a difference of 8 between consecutive primes.
 * @author Sean A. Irvine
 */
public class A031926 extends A000040 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      if (mPrime.nextPrime(p).equals(p.add(8))) {
        return p;
      }
    }
  }
}
