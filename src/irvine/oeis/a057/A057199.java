package irvine.oeis.a057;

import irvine.factor.prime.Fast;
import irvine.math.LongUtils;
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
      if (LongUtils.isPalindrome(p, mN) && LongUtils.isPalindrome(p, mN + 2)) {
        return Z.valueOf(p);
      }
    }
  }
}
