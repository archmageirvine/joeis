package irvine.oeis.a007;

import irvine.math.IntegerUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A007886.
 * @author Sean A. Irvine
 */
public class A007886 implements Sequence {

  private int mN = -1;
  private Z mA = Z.ONE;

  @Override
  public Z next() {
    if (++mN > 0) {
      mA = mA.add(Z.ONE.shiftLeft(mN - 1 - IntegerUtils.lg(mN - 1)));
    }
    return mA;
  }
}
