package irvine.oeis.a016;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.string.StringUtils;

/**
 * A016041 Primes that are palindromic in base <code>2</code> (but written here in base <code>10)</code>.
 * @author Sean A. Irvine
 */
public class A016041 implements Sequence {

  private final Fast mPrime = new Fast();
  private Z mP = Z.ONE;

  @Override
  public Z next() {
    while (true) {
      mP = mPrime.nextPrime(mP);
      if (StringUtils.isPalindrome(mP.toString(2))) {
        return mP;
      }
    }
  }
}
