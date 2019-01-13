package irvine.oeis.a005;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A005425.
 * @author Sean A. Irvine
 */
public class A005425 implements Sequence {

  private long mN = -1;
  private Z mA = Z.ONE;
  private Z mB = Z.TWO;

  @Override
  public Z next() {
    if (++mN < 2) {
      if (mN == 0) {
        return Z.ONE;
      }
    } else {
      final Z t = mB.multiply2().add(mA.multiply(mN - 1));
      mA = mB;
      mB = t;
    }
    return mB;
  }
}
