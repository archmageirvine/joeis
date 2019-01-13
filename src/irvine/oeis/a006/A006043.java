package irvine.oeis.a006;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A006043.
 * @author Sean A. Irvine
 */
public class A006043 implements Sequence {

  private Z mA = Z.ONE;
  private long mN = 0;

  @Override
  public Z next() {
    if (++mN > 1) {
      mA = mA.multiply(3);
    }
    return mA.multiply(mN).multiply(mN + 1);
  }
}

