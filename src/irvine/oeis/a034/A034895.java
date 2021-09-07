package irvine.oeis.a034;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A034895 Dropping any digit gives a prime number.
 * @author Sean A. Irvine
 */
public class A034895 implements Sequence {

  private Z mN = Z.valueOf(21);

  /**
   * True iff dropping any single digit from n yields a prime.
   * @param n number to test
   * @return true iff dropping any digit yields a prime.
   */
  public static boolean is(final Z n) {
    final String s = n.toString();
    if (s.length() <= 1) {
      return false;
    }
    for (int k = 0; k < s.length(); ++k) {
      if (!new Z(s.substring(0, k) + s.substring(k + 1)).isProbablePrime()) {
        return false;
      }
    }
    return true;
  }

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      if (is(mN)) {
        return mN;
      }
    }
  }
}
