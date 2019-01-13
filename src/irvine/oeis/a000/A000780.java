package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A000780.
 * @author Sean A. Irvine
 */
public class A000780 implements Sequence {

  private long mN = 0;
  private Z mF = Z.ONE;

  @Override
  public Z next() {
    if (mN > 1) {
      mF = mF.multiply(mN);
    }
    ++mN;
    return mF.multiply((mN * mN + 3 * mN - 2) / 2);
  }
}

