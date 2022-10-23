package irvine.oeis.a056;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A056920 Denominators of continued fraction for left factorial.
 * @author Sean A. Irvine
 */
public class A056920 extends Sequence0 {

  private Z mA = Z.ONE;
  private Z mB = Z.ONE;
  private long mN = -1;

  @Override
  public Z next() {
    if (++mN > 1) {
      final Z t = mB.subtract(mA.multiply(mN / 2));
      mA = mB;
      mB = t;
    }
    return mB;
  }
}

