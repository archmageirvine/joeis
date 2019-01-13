package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A001807.
 * @author Sean A. Irvine
 */
public class A001807 implements Sequence {

  private long mN = 4;
  private Z mA = Z.valueOf(120);

  @Override
  public Z next() {
    if (++mN > 5) {
      mA = mA.multiply(Z.valueOf(mN).square()).divide(mN - 5);
    }
    return mA;
  }
}
