package irvine.oeis.a006;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.string.StringUtils;

/**
 * A006341 Octal palindromes which are also primes.
 * @author Sean A. Irvine
 */
public class A006341 implements Sequence {

  private final Fast mPrime = new Fast();
  private Z mN = Z.ONE;

  @Override
  public Z next() {
    while (true) {
      mN = mPrime.nextPrime(mN);
      final String p = mN.toString(8);
      if (StringUtils.isPalindrome(p)) {
        return new Z(p);
      }
    }
  }
}

