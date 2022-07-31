package irvine.oeis.a058;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A058229 Digits composite, each digit minus 1 is prime, sum of digits minus 1 is prime, difference of digits (in absolute value) minus 1 is prime.
 * @author Sean A. Irvine
 */
public class A058229 implements Sequence {

  private static final int[] REPLACEMENTS = {4, 6, 8};
  private final Fast mPrime = new Fast();
  private long mN = 2;
  private long mLim = 6;

  @Override
  public Z next() {
    while (true) {
      if (++mN == mLim) {
        mLim *= 3;
        mN = mLim / 2;
      }
      long m = mN;
      long sum = -1;
      while (m != 1) {
        sum += REPLACEMENTS[(int) (m % 3)];
        m /= 3;
      }
      if (mPrime.isPrime(sum)) {
        final String s = Long.toString(mN, 3).replace('0', '4').replace('1', '6').replace('2', '8').substring(1);
        long diff = s.charAt(0) - '0';
        for (int k = 1; k < s.length(); ++k) {
          diff -= s.charAt(k) - '0';
        }
        if (mPrime.isPrime(Math.abs(diff) - 1)) {
          return new Z(s);
        }
      }
    }
  }
}

