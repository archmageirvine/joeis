package irvine.oeis.a065;

import irvine.math.z.Z;
import irvine.oeis.a000.A000796;

/**
 * A065593 First re-appearance of first n digits in decimal expansion of Pi.
 * @author Sean A. Irvine
 */
public class A065593 extends A000796 {

  private final StringBuilder mPi = new StringBuilder();
  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    while (mPi.length() < mN) {
      mPi.append(super.next());
    }
    final String s = mPi.substring(0, mN);
    // Because we are taking longer and longer prefix, we can be sure that the prefix is not already repeated
    // in the digits we have accumulated so far, so we scan ahead until a match is found.
    while (true) {
      mPi.append(super.next());
      if (mPi.substring(mPi.length() - s.length()).equals(s)) {
        return Z.valueOf(mPi.length() - s.length() + 1);
      }
    }
  }
}
