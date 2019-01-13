package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A001120.
 * @author Sean A. Irvine
 */
public class A001120 implements Sequence {

  private Z mPrev = Z.TWO;
  private long mN = 0;
  private long mA = 1;

  @Override
  public Z next() {
    mA = -mA;
    mPrev = mPrev.multiply(++mN).add(mA);
    return mPrev;
  }
}

