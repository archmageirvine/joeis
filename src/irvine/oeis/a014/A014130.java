package irvine.oeis.a014;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A014130.
 * @author Sean A. Irvine
 */
public class A014130 implements Sequence {

  private Z mA = Z.ONE;
  private long mN = -2;

  @Override
  public Z next() {
    if (++mN >= 0) {
      mA = mA.multiply(2 * mN + 3).multiply(mN + 4);
    }
    return mA;
  }
}
