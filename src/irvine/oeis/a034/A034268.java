package irvine.oeis.a034;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A034268.
 * @author Sean A. Irvine
 */
public class A034268 implements Sequence {

  private int mN = 0;
  private Z mLcm = Z.ONE;

  @Override
  public Z next() {
    mLcm = mLcm.lcm(Z.ONE.shiftLeft(++mN).subtract(1));
    return mLcm;
  }
}

