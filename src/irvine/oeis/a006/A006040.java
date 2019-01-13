package irvine.oeis.a006;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A006040.
 * @author Sean A. Irvine
 */
public class A006040 implements Sequence {

  private Z mA = Z.ONE;
  private long mN = -1;

  @Override
  public Z next() {
    if (++mN > 0) {
      mA = mA.multiply(mN).multiply(mN).add(1);
    }
    return mA;
  }
}

