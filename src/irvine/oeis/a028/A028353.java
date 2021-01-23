package irvine.oeis.a028;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A028353 Coefficient of x^(2*n+1) in arctanh(x)/sqrt(1-x^2), multiplied by (2*n+1)!.
 * @author Sean A. Irvine
 */
public class A028353 implements Sequence {

  private long mN = -1;
  private Z mA = Z.ONE;
  private Z mB = Z.FIVE;

  @Override
  public Z next() {
    if (++mN > 1) {
      final Z t = mB.multiply(8 * mN * mN - 4 * mN + 1).subtract(mA.multiply(2 * mN - 1).multiply(2 * mN - 1).multiply(mN - 1).multiply(mN - 1).multiply(4));
      mA = mB;
      mB = t;
    } else if (mN == 0) {
      return Z.ONE;
    }
    return mB;
  }
}

