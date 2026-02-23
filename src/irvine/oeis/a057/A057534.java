package irvine.oeis.a057;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A057534 Start with 61; to get the next term, divide by the smallest prime factor &lt; 17 if it exists, else multiply by 17 and add 1.
 * @author Sean A. Irvine
 */
public class A057534 extends Sequence0 {

  private long mN = 0;

  @Override
  public Z next() {
    if (mN == 0) {
      mN = 61;
    } else if ((mN & 1) == 0) {
      mN /= 2;
    } else if (mN % 3 == 0) {
      mN /= 3;
    } else if (mN % 5 == 0) {
      mN /= 5;
    } else if (mN % 7 == 0) {
      mN /= 7;
    } else if (mN % 11 == 0) {
      mN /= 11;
    } else if (mN % 13 == 0) {
      mN /= 13;
    } else {
      mN = mN * 17 + 1;
    }
    return Z.valueOf(mN);
  }
}
