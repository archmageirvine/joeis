package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A001762.
 * @author Sean A. Irvine
 */
public class A001762 implements Sequence {

  private long mN = 2;
  private Z mA = Z.ONE;

  @Override
  public Z next() {
    if (++mN > 4) {
      mA = mA.multiply(3 * mN).multiply(3 * mN - 10).multiply(3 * mN - 11)
        .divide(2 * mN - 4).divide(2 * mN - 5);
    }
    return mA;
  }
}
