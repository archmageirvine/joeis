package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A001754.
 * @author Sean A. Irvine
 */
public class A001754 implements Sequence {

  private long mN = 0;
  private Z mF = Z.ONE;

  @Override
  public Z next() {
    mF = mF.multiply(++mN);
    return mF.multiply(mN - 2).multiply(mN - 1).divide(12);
  }
}
