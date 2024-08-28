package irvine.oeis.a072;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A071265.
 * @author Sean A. Irvine
 */
public class A072043 extends Sequence1 {

  private Z mA = Z.ONE;
  private Z mB = Z.ONE;
  private Z mC = Z.ONE;
  private long mN = 0;

  @Override
  public Z next() {
    if (++mN > 3) {
      final Z t = mA.multiply(mB).multiply(mC).multiply(mN - 2).divide(mN - 3);
      mA = mB;
      mB = mC;
      mC = t;
    }
    return mC;
  }
}

