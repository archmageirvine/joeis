package irvine.oeis.a054;

import irvine.math.z.Z;
import irvine.oeis.a002.A002385;
import irvine.util.string.StringUtils;

/**
 * A054797 Smallest prime number whose digits sum to the n-th palindromic prime.
 * @author Sean A. Irvine
 */
public class A054797 extends A002385 {

  // After C++ by David Consiglio, Jr.

  private final StringBuilder mCandidate = new StringBuilder();

  private StringBuilder generate(final long sum) {
    mCandidate.append(sum % 9);
    mCandidate.append(StringUtils.rep('9', (int) sum / 9));
    final StringBuilder max = new StringBuilder(mCandidate);
    max.reverse();
    return max;
  }

  private int locate() {
    for (int a = mCandidate.length() - 1; a >= 0; --a) {
      if (mCandidate.charAt(a) != '9') {
        return a;
      }
    }
    throw new RuntimeException();
  }

  private void inc(final int pos) {
    mCandidate.setCharAt(pos, (char) (mCandidate.charAt(pos) + 1));
    mCandidate.setCharAt(pos + 1, (char) (mCandidate.charAt(pos + 1) - 1));
  }

  private int reverseLocate() {
    for (int a = mCandidate.length() - 2; a >= 0; a--) { //search backwards for first non-9
      if (mCandidate.charAt(a) != '9') {
        return a;
      }
    }
    throw new RuntimeException();
  }

  private boolean lt(final StringBuilder a, final StringBuilder b) {
    for (int k = 0; k < a.length(); ++k) {
      final int c = Character.compare(a.charAt(k), b.charAt(k));
      if (c < 0) {
        return true;
      } else if (c > 0) {
        return false;
      }
    }
    return false;
  }

  @Override
  public Z next() {
    final Z palin = super.next();
    final long sum = palin.longValueExact();
    if (sum < 10) {
      return palin;
    }
    mCandidate.setLength(0); // clear
    final StringBuilder max = generate(sum); // determines lowest and highest candidates
    final Z c0 = new Z(mCandidate);
    if (c0.isProbablePrime()) {
      return c0;
    }
    inc(0);
    final Z c1 = new Z(mCandidate);
    if (c1.isProbablePrime()) {
      return c1;
    }
    while (lt(mCandidate, max)) {
      while (mCandidate.charAt(mCandidate.length() - 1) == '9') { // we are iterating through a run of 89 swaps
        inc(locate());
        final Z c2 = new Z(mCandidate);
        if (c2.isProbablePrime()) {
          return c2;
        }
      }
      final int pos = reverseLocate(); //undo all the swaps
      mCandidate.setCharAt(pos, (char) (mCandidate.charAt(pos) + 1)); // increase the last non-9 number
      mCandidate.setCharAt(pos + 1, mCandidate.charAt(mCandidate.length() - 1)); // put the last digit
      mCandidate.setCharAt(pos + 1, (char) (mCandidate.charAt(pos + 1) - 1));
      if (pos + 1 != mCandidate.length() - 1) {
        mCandidate.setCharAt(mCandidate.length() - 1, '9'); // put the last 9 back
      }
      final Z c3 = new Z(mCandidate);
      if (c3.isProbablePrime()) {
        return c3;
      }
    }
    throw new RuntimeException();
  }
}
