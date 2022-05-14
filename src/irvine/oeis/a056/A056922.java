package irvine.oeis.a056;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A056922 Denominators of continued fraction for alternating factorial.
 * @author Sean A. Irvine
 */
public class A056922 implements Sequence {

  private Z mA = Z.ONE;
  private Z mB = Z.ONE;
  private long mN = -1;

  @Override
  public Z next() {
    if (++mN > 1) {
      final Z t = (mN & 1) == 0 ? mA.add(mB.multiply(mN / 2)) : mA.add(mB);
      mA = mB;
      mB = t;
    }
    return mB;
  }
}
