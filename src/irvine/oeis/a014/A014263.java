package irvine.oeis.a014;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A014263 Numbers that contain even digits only.
 * @author Sean A. Irvine
 */
public class A014263 extends Sequence1 {

  private long mN = -2;

  private boolean isEvenDigits(long n) {
    while (n != 0) {
      if ((n & 1) == 1) {
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
      if (isEvenDigits(mN)) {
        return Z.valueOf(mN);
      }
    }
  }
}

