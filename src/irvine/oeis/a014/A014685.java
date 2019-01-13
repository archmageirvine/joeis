package irvine.oeis.a014;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A014685.
 * @author Sean A. Irvine
 */
public class A014685 implements Sequence {

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
