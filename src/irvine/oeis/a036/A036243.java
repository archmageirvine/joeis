package irvine.oeis.a036;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A036243 Denominator of fraction equal to the continued fraction [ 0, 2, 4, ...2n ].
 * @author Sean A. Irvine
 */
public class A036243 extends Sequence0 {

  private long mN = -1;
  private Z mA = null;
  private Z mB = Z.TWO;

  @Override
  public Z next() {
    if (mA == null) {
      mA = Z.ONE;
      return Z.ONE;
    }
    if (++mN > 0) {
      final Z t = mB.multiply(2 * mN + 2).add(mA);
      mA = mB;
      mB = t;
    }
    return mB;
  }
}

