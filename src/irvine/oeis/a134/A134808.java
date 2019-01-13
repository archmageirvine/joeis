package irvine.oeis.a134;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A134808.
 * @author Sean A. Irvine
 */
public class A134808 implements Sequence {

  private Z mN = Z.NEG_ONE;

  /**
   * Test for a cyclops number.  Such numbers have an odd number of digits
   * a 0 in the central position and no other zeros.
   *
   * @param n number to test
   * @return true if <code>n</code> is a cyclops number
   */
  public static boolean isCyclops(final Z n) {
    final String s = n.toString();
    final int l = s.length();
    if ((l & 1) == 0) {
      return false;
    }
    if (s.charAt(l / 2) != '0') {
      return false;
    }
    for (int k = 1; k < l / 2; ++k) {
      if (s.charAt(k) == '0') {
        return false;
      }
    }
    for (int k = l / 2 + 1; k < l; ++k) {
      if (s.charAt(k) == '0') {
        return false;
      }
    }
    return true;
  }

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      if (isCyclops(mN)) {
        return mN;
      }
    }
  }
}

