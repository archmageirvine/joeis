package irvine.oeis.a393;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A393417 a(n) = p is the smallest prime number, such that the sequence of 2n+1 consecutive prime numbers modulo n starting with p mod n is palindromic.
 * @author Sean A. Irvine
 */
public class A393417 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private int mN = 0;

  private boolean palindrome(final long[] s) {
    for (int k = 0, j = s.length - 1; k < j; ++k, --j) {
      if (s[k] != s[j]) {
        return false;
      }
    }
    return true;
  }

  @Override
  public Z next() {
    ++mN;
    final long[] s = new long[2 * mN + 1];
    long p = 1;
    for (int k = 0; k < s.length; ++k) {
      p = mPrime.nextPrime(p);
      s[k] = p % mN;
    }
    long q = 2;
    while (!palindrome(s)) {
      q = mPrime.nextPrime(q);
      p = mPrime.nextPrime(p);
      System.arraycopy(s, 1, s, 0, s.length - 1);
      s[s.length - 1] = p % mN;
    }
    return Z.valueOf(q);
  }
}
