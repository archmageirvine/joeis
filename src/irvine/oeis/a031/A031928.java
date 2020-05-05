package irvine.oeis.a031;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A031928 Lower prime of a difference of 10 between consecutive primes.
 * @author Sean A. Irvine
 */
public class A031928 extends A000040 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      if (mFast.nextPrime(p).equals(p.add(10))) {
        return p;
      }
    }
  }
}
