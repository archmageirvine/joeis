package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A001806.
 * @author Sean A. Irvine
 */
public class A001806 implements Sequence {

  private long mN = 3;
  private Z mA = Z.valueOf(24);

  @Override
  public Z next() {
    if (++mN > 4) {
      mA = mA.multiply(Z.valueOf(mN).square()).divide(mN - 4);
    }
    return mA;
  }
}
