package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A001818 Squares of double factorials: (1*3*5*...*(2n-1))^2 = ((2*n-1)!!)^2.
 * @author Sean A. Irvine
 */
public class A001818 implements Sequence {

  private long mN = -3;
  private Z mA = Z.ONE;

  @Override
  public Z next() {
    mN += 2;
    if (mN > 0) {
      mA = mA.multiply(Z.valueOf(mN).square());
    }
    return mA;
  }
}
