package irvine.oeis.a012;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A012244.
 * @author Sean A. Irvine
 */
public class A012244 implements Sequence {

  private long mN = -1;
  private Z mA = Z.ONE;
  private Z mB = Z.ONE;

  @Override
  public Z next() {
    if (++mN > 1) {
      final Z t = mB.multiply(2 * mN - 1).add(mA.multiply(mN - 1).multiply(mN - 1));
      mA = mB;
      mB = t;
    }
    return mB;
  }
}
