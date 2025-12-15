package irvine.oeis.a391;

import irvine.math.z.Z;
import irvine.oeis.a022.A022544;

/**
 * A391207 The smallest nonnegative integer k such that n + k is not a sum of two squares.
 * @author Sean A. Irvine
 */
public class A391207 extends A022544 {

  private Z mA = super.next();
  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    if (mA.compareTo(mN) < 0) {
      mA = super.next();
    }
    return mA.subtract(mN);
  }
}
