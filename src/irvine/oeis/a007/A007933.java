package irvine.oeis.a007;

import java.util.Arrays;
import java.util.HashSet;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A007933.
 * @author Sean A. Irvine
 */
public class A007933 implements Sequence {

  private Z mN = Z.ZERO;
  private final HashSet<String> mSortedPrimes = new HashSet<>();
  protected final Fast mPrime = new Fast();
  private Z mP = Z.ONE;

  private String sort(final Z n) {
    final char[] digits = n.toString().toCharArray();
    Arrays.sort(digits);
    return new String(digits);
  }

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      while (mN.bitLength() + 4 >= mP.bitLength()) {
        mP = mPrime.nextPrime(mP);
        mSortedPrimes.add(sort(mP));
      }
      // Need to be a little careful with leading 0s
      String s = sort(mN);
      if (mSortedPrimes.contains(s)) {
        return mN;
      }
      while (s.charAt(0) == '0') {
        s = s.substring(1);
        if (mSortedPrimes.contains(s)) {
          return mN;
        }
      }
    }
  }
}
