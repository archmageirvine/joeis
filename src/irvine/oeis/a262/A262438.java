package irvine.oeis.a262;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A262438 Number of digits of hexadecimal representation of n.
 * @author Sean A. Irvine
 */
public class A262438 extends Sequence0 {

  private long mN = -1;
  private long mLim = 16;
  private Z mDigits = Z.ONE;

  @Override
  public Z next() {
    if (++mN == mLim) {
      mDigits = mDigits.add(1);
      mLim *= 16;
    }
    return mDigits;
  }
}
