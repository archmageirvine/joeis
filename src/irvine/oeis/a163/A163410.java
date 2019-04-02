package irvine.oeis.a163;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.string.StringUtils;

import java.util.ArrayList;

/**
 * A163410 A positive integer is included if it is a palindrome when written in binary, and it is not divisible by any primes that are not binary palindromes.
 * @author Sean A. Irvine
 */
public class A163410 implements Sequence {

  private long mN = -1;
  private final Fast mPrime = new Fast();
  private final ArrayList<Long> mSeq = new ArrayList<>();

  private boolean divisibleByKnownPalindromes(long n) {
    for (final Long l : mSeq) {
      while (n % l == 0) {
        n /= l;
        if (n == 1) {
          return true;
        }
      }
    }
    assert n != 1;
    return false;
  }

  @Override
  public Z next() {
    while (true) {
      mN += 2;
      if (mN == 1) {
        return Z.ONE;
      }
      if (StringUtils.isPalindrome(Long.toBinaryString(mN))
          && (mPrime.isPrime(mN) || divisibleByKnownPalindromes(mN))) {
        mSeq.add(mN);
        return Z.valueOf(mN);
      }
    }
  }
}

