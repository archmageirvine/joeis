package irvine.oeis.a006;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A006882.
 * @author Sean A. Irvine
 */
public class A006882 implements Sequence {

  private long mN = -1;
  private Z mA = Z.ONE;
  private Z mB = Z.ONE;

  @Override
  public Z next() {
    if (++mN > 1) {
      final Z t = mA.multiply(mN);
      mA = mB;
      mB = t;
    }
    return mB;
  }
}
