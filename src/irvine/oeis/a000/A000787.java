package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A000787.
 * @author Sean A. Irvine
 */
public class A000787 implements Sequence {

  private Z mN = Z.NEG_ONE;

  /**
   * Test if the given number is strobogrammatic.
   * @param n number to test
   * @return true iff number is strobogrammatic
   */
  public static boolean isStrobogrammatic(final Z n) {
    final long last = n.mod(10);
    if ((last >= 2 && last <= 5) || last == 7) {
      return false;
    }
    final String s = n.toString();
    for (int k = 0, j = s.length() - 1; k < (s.length() + 1) / 2; ++k, --j) {
      final char c = s.charAt(k);
      if ("23457".indexOf(c) != -1) {
        return false;
      } else if (c == '6') {
        if (s.charAt(j) != '9') {
          return false;
        }
      } else if (c == '9') {
        if (s.charAt(j) != '6') {
          return false;
        }
      } else if (c != s.charAt(j)) {
        return false;
      }
    }
    return true;
  }

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      if (isStrobogrammatic(mN)) {
        return mN;
      }
    }
  }
}
