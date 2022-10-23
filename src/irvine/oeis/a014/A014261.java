package irvine.oeis.a014;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A014261 Numbers that contain odd digits only.
 * @author Sean A. Irvine
 */
public class A014261 extends Sequence1 {

  private long mN = -1;

  /**
   * Test if a number contains only odd digits.
   * @param n number to test
   * @return true iff the number contains only odd digits
   */
  public static boolean isOddDigits(long n) {
    while (n != 0) {
      if ((n & 1) == 0) {
        return false;
      }
      n /= 10;
    }
    return true;
  }

  @Override
  public Z next() {
    while (true) {
      mN += 2;
      if (isOddDigits(mN)) {
        return Z.valueOf(mN);
      }
    }
  }
}

