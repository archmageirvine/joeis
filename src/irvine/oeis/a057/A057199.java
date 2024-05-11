package irvine.oeis.a057;

import irvine.factor.prime.Fast;
import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A057199 The first nontrivial (k&gt;n+2) palindromic prime in both bases n and n+2 or -1 if it does not exist.
 * @author Sean A. Irvine
 */
public class A057199 extends Sequence2 {

  private final Fast mPrime = new Fast();
  private int mN = 1;

  @Override
  public Z next() {
    ++mN;
    long p = mN + 2;
    while (true) {
      p = mPrime.nextPrime(p);
      if (Predicates.PALINDROME.is(mN, p) && Predicates.PALINDROME.is(mN + 2, p)) {
        return Z.valueOf(p);
      }
    }
  }
}
