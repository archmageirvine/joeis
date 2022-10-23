package irvine.oeis.a054;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.string.StringUtils;

/**
 * A054266 Sum of composite numbers between prime p and nextprime(p) is palindromic.
 * @author Sean A. Irvine
 */
public class A054266 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mN = 3;

  @Override
  public Z next() {
    while (true) {
      final long p = mN;
      long sum = 0;
      while (!mPrime.isPrime(++mN)) {
        sum += mN;
      }
      if (StringUtils.isPalindrome(String.valueOf(sum))) {
        return Z.valueOf(p);
      }
    }
  }
}
