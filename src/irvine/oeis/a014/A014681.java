package irvine.oeis.a014;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A014681 Fix 0; exchange even and odd numbers.
 * @author Sean A. Irvine
 */
public class A014681 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    if (mN == -1) {
      mN = 0;
    } else if (mN == 0) {
      mN = 2;
    } else if ((mN & 1) == 0) {
      --mN;
    } else {
      mN += 3;
    }
    return Z.valueOf(mN);
  }
}

