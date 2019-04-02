package irvine.oeis.a014;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A014261 Numbers that contain odd digits only.
 * @author Sean A. Irvine
 */
public class A014261 implements Sequence {

  private long mN = -1;

  private boolean isOddDigits(long n) {
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

