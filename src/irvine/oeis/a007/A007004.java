package irvine.oeis.a007;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A007004.
 * @author Sean A. Irvine
 */
public class A007004 implements Sequence {

  private Z mA = Z.ONE;
  private long mN = -1;

  @Override
  public Z next() {
    if (++mN > 0) {
      mA = mA.multiply(3 * mN - 2).multiply(3 * mN - 1).multiply(3).divide(mN + 1).divide(mN);
    }
    return mA;
  }
}

