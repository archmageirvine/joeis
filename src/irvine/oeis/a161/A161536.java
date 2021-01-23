package irvine.oeis.a161;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.string.StringUtils;

/**
 * A161536 a(1)=1. a(n) = the smallest integer &gt; a(n-1) that is an (odd) palindrome when written in binary, and is such that (a(n)-a(n-1))/2 is prime.
 * @author Sean A. Irvine
 */
public class A161536 implements Sequence {

  private long mN = 0;
  private long mPrev = 0;
  private final Fast mPrime = new Fast();

  @Override
  public Z next() {
    if (mN == 0) {
      mPrev = 1;
      mN = 1;
      return Z.ONE;
    }
    while (true) {
      mN += 2;
      if (StringUtils.isPalindrome(Long.toBinaryString(mN)) && mPrime.isPrime((mN - mPrev) / 2)) {
        mPrev = mN;
        return Z.valueOf(mN);
      }
    }
  }
}

