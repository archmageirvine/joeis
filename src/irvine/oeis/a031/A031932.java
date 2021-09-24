package irvine.oeis.a031;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A031932 Lower prime of a pair of consecutive primes having a difference of 14.
 * @author Sean A. Irvine
 */
public class A031932 extends A000040 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      if (mPrime.nextPrime(p).equals(p.add(14))) {
        return p;
      }
    }
  }
}
