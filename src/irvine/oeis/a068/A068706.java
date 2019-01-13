package irvine.oeis.a068;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A068706.
 * @author Sean A. Irvine
 */
public class A068706 implements Sequence {

  private final Fast mPrime = new Fast();
  private Z mN = Z.valueOf(240);

  private boolean check(final String s, final int initialLength) {
    final char c = s.charAt(initialLength - 1);
    if (c == '1' || c == '3' || c == '5' || c == '7' || c == '9') {
      return false;
    }
    String sv = s.substring(0, initialLength);
    long v = Long.parseLong(sv);
    int p = sv.length();
    while (p < s.length()) {
      v += 2;
      sv = String.valueOf(v);
      if (s.indexOf(sv, p) != p) {
        return false;
      }
      p += sv.length();
    }
    return true;
  }

  // check s is a concatenation of consecutive even numbers
  private boolean check(final String s) {
    for (int k = 1; k <= s.length() / 2; ++k) {
      if (check(s, k)) {
        return true;
      }
    }
    return false;
  }

  @Override
  public Z next() {
    while (true) {
      mN = mPrime.nextPrime(mN);
      final String p = mN.toString();
      if (p.endsWith("1") && check(p.substring(0, p.length() - 1))) {
        return mN;
      }
    }
  }
}

