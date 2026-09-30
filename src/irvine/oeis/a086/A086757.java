package irvine.oeis.a086;

import irvine.factor.prime.Fast;
import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A086757 Smallest prime p such that n is a palindrome in base-p representation.
 * @author Sean A. Irvine
 */
public class A086757 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    long p = 2;
    while (true) {
      if (Predicates.PALINDROME.is(p, mN)) {
        return Z.valueOf(p);
      }
      p = mPrime.nextPrime(p);
    }
  }
}
