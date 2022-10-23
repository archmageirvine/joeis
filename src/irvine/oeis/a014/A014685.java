package irvine.oeis.a014;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A014685 In sequence of positive integers add 1 to first prime and subtract 1 from 2nd prime; add 1 to 3rd prime and subtract 1 from 4th prime and so on.
 * @author Sean A. Irvine
 */
public class A014685 extends Sequence1 {

  private Z mN = Z.ZERO;
  private long mSign = -1;

  @Override
  public Z next() {
    mN = mN.add(1);
    if (mN.isProbablePrime()) {
      mSign = -mSign;
      return mN.add(mSign);
    } else {
      return mN;
    }
  }
}
