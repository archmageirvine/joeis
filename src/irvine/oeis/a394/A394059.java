package irvine.oeis.a394;

import irvine.factor.prime.Fast;
import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A394059 a(n) is the smallest index k such that the subsequence b(k), b(k+1),..., b(k+n-1) is a palindrome of length n, where b(k) = prime(k) mod 6 = A039704(k).
 * @author Sean A. Irvine
 */
public class A394059 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private int mN = 0;

  @Override
  public Z next() {
    final long[] v = new long[++mN];
    long p = 1;
    for (int j = 0; j < v.length; ++j) {
      p = mPrime.nextPrime(p);
      v[j] = p % 6;
    }
    long k = 1;
    while (!LongUtils.isPalindrome(v)) {
      System.arraycopy(v, 1, v, 0, v.length - 1);
      p = mPrime.nextPrime(p);
      v[v.length - 1] = p % 6;
      ++k;
    }
    return Z.valueOf(k);
  }
}
