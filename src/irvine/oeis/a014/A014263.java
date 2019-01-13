package irvine.oeis.a014;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A014263.
 * @author Sean A. Irvine
 */
public class A014263 implements Sequence {

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

