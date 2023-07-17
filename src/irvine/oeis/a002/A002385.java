package irvine.oeis.a002;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.util.string.StringUtils;

/**
 * A002385 Palindromic primes: prime numbers whose decimal expansion is a palindrome.
 * @author Sean A. Irvine
 */
public class A002385 extends AbstractSequence {

  /**
   * Constructor with offset.
   * @param offset first index
   */
  protected A002385(final int offset) {
    super(offset);
  }

  /** Construct the sequence. */
  public A002385() {
    super(1);
  }

  protected final Fast mPrime = new Fast();
  private Z mP = Z.ONE;

  @Override
  public Z next() {
    while (true) {
      mP = mPrime.nextPrime(mP);
      final String p = mP.toString();
      final int len = p.length();
      if ((len & 1) == 0 && len > 2) {
        // There are no even length prime palindromes with length > 2, so skip ahead
        mP = Z.TEN.pow(len);
        continue;
      }
      if (StringUtils.isPalindrome(p)) {
        return mP;
      }
    }
  }
}
