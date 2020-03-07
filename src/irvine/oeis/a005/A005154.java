package irvine.oeis.a005;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A005154 Number of stable matchings.
 * @author Sean A. Irvine
 */
public class A005154 implements Sequence {

  private long mN = -1;
  private Z mA = Z.ONE;
  private Z mB = Z.TWO;

  @Override
  public Z next() {
    if (++mN <= 1) {
      return Z.valueOf(mN + 1);
    }
    final Z t = mB.square().multiply(3).subtract(mA.pow(4).multiply2());
    mA = mB;
    mB = t;
    return mB;
  }
}

