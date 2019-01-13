package irvine.oeis.a006;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A006088.
 * @author Sean A. Irvine
 */
public class A006088 implements Sequence {

  private Z mA = Z.ONE;
  private int mN = -1;

  @Override
  public Z next() {
    if (++mN > 0) {
      mA = mA.multiply(Z.ONE.shiftLeft(mN).add(2));
    }
    return mA;
  }
}

