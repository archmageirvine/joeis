package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A001594 6^n + n^6.
 * @author Sean A. Irvine
 */
public class A001594 implements Sequence {

  private long mN = -1;
  private Z mT = Z.ONE;

  @Override
  public Z next() {
    if (++mN > 0) {
      mT = mT.multiply(6);
    }
    return mT.add(Z.valueOf(mN * mN).multiply(mN).square());
  }
}
