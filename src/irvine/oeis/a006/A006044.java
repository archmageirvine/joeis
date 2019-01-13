package irvine.oeis.a006;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A006044.
 * @author Sean A. Irvine
 */
public class A006044 implements Sequence {

  private Z mA = Z.ONE;
  private long mN = 0;

  @Override
  public Z next() {
    if (++mN > 1) {
      mA = mA.multiply(4);
    }
    return mA.multiply(mN).multiply(mN + 1).multiply(mN + 2);
  }
}

