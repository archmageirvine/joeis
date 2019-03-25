package irvine.oeis.a137;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.string.StringUtils;

/**
 * A137833.
 * @author Sean A. Irvine
 */
public class A137833 implements Sequence {

  private final Fast mPrime = new Fast();
  private Z mN = Z.valueOf(36);

  private boolean valid(final String s) {
    if (StringUtils.isPalindrome(s)) {
      return false;
    }
    for (int k = 0; k < s.length(); ++k) {
      final char c = s.charAt(k);
      if (((11272192 >> c) & 1) == 0) {
        return false;
      }
      /*
      if (c == '0' || c == '1' || c == '4' || c == '6' || c == '8' || c == '9') {
        return false;
      }
      */
    }
    return true;
  }

  @Override
  public Z next() {
    while (true) {
      mN = mPrime.nextPrime(mN);
      final String s = mN.toString();
      if (mPrime.isPrime(s.length())) {
        if (valid(s) && new Z(new StringBuilder(s).reverse()).isPrime()) {
          return mN;
        }
      } else {
        // Short cut to next power of 10
        final StringBuilder sb = new StringBuilder("2");
        for (int k = 0; k < s.length(); ++k) {
          sb.append('2');
        }
        mN = new Z(sb);
      }
    }
  }
}

