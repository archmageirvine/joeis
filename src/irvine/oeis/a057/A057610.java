package irvine.oeis.a057;

import irvine.math.z.Z;
import irvine.oeis.a000.A000959;

/**
 * A057610 Smallest lucky number containing leading sequence of n descending numbers.
 * @author Sean A. Irvine
 */
public class A057610 extends A000959 {

  // todo data does not match definition!

  private int mN = 0;
  private Z mA = super.next();

  private boolean is(final Z n, final int len) {
    final String s = n.toString();
    if (s.length() < len) {
      return false;
    }
    for (int length = 1; length <= s.length(); ++length) {
      int leading = Integer.parseInt(s.substring(0, length));
      //System.out.println(len + " " + n + " " + leading);
      if (leading < len - 1) {
        continue; // Would reach zero
      }
      boolean ok = true;
      outer:
      for (int k = 1, j = length; k < len; ++k, ++j) {
        final String t = String.valueOf(--leading);
        for (int l = 0; l < t.length(); ++l) {
          if (j >= s.length() || s.charAt(j) != t.charAt(l)) {
            ok = false;
            break outer;
          }
        }
      }
      if (ok) {
        return true;
      }
    }
    return false;
  }

  @Override
  public Z next() {
    ++mN;
    while (!is(mA, mN)) {
      mA = super.next();
    }
    return mA;
  }
}
