package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A001879.
 * @author Sean A. Irvine
 */
public class A001879 implements Sequence {

  private Z mA = Z.ONE;
  private long mN = -1;

  @Override
  public Z next() {
    if (++mN > 0) {
      mA = mA.multiply(2 * mN + 1).multiply(mN + 1).divide(mN);
    }
    return mA;
  }
}
