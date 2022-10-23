package irvine.oeis.a054;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;
import irvine.util.string.StringUtils;

/**
 * A054267 Sum of composite numbers between prime p and nextprime(p) is palindromic with restriction 'p + 1 &lt;&gt; sum'.
 * @author Sean A. Irvine
 */
public class A054267 extends Sequence0 {

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
      if (sum != p + 1 && StringUtils.isPalindrome(String.valueOf(sum))) {
        return Z.valueOf(p);
      }
    }
  }
}
