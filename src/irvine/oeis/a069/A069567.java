package irvine.oeis.a069;

import java.util.Arrays;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.a000.A000040;

/**
 * A069567 Smaller of two consecutive primes which are anagrams of each other.
 * @author Sean A. Irvine
 */
public class A069567 extends A000040 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      final Z q = mPrime.nextPrime(p);
      if (Arrays.equals(ZUtils.digitCounts(p), ZUtils.digitCounts(q))) {
        return p;
      }
    }
  }
}
