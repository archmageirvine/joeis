package irvine.oeis.a006;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A006595.
 * @author Sean A. Irvine
 */
public class A006595 implements Sequence {

  private long mN = -1;
  private Z mF = Z.ONE;

  @Override
  public Z next() {
    if (++mN > 1) {
      mF = mF.multiply(mN);
    }
    return mF.multiply(mN + 1).multiply(mN + 2).divide2().add(mF).divide2();
  }
}
