package irvine.oeis.a031;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A031934 Lower prime of a pair of consecutive primes having a difference of 16.
 * @author Sean A. Irvine
 */
public class A031934 extends A000040 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      if (mFast.nextPrime(p).equals(p.add(16))) {
        return p;
      }
    }
  }
}
