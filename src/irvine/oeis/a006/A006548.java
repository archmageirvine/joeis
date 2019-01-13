package irvine.oeis.a006;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A006548.
 * @author Sean A. Irvine
 */
public class A006548 implements Sequence {

  private Z mF = Z.ONE;
  private int mN = 0;

  @Override
  public Z next() {
    if (++mN > 1) {
      mF = mF.multiply(2 * mN - 1).multiply(2 * mN - 2);
    }
    return mF.multiply(mN / 2).multiply(4);
  }
}
