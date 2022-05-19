package irvine.oeis.a056;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A056952 Numerators of continued fraction for alternating factorial.
 * @author Sean A. Irvine
 */
public class A056952 implements Sequence {

  private Z mA = Z.ZERO;
  private Z mB = Z.ONE;
  private long mN = -1;

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ZERO;
    } else if (mN > 1) {
      final Z t = mB.add(mA.multiply(mN / 2));
      mA = mB;
      mB = t;
    }
    return mB;
  }
}
