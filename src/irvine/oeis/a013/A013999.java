package irvine.oeis.a013;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A013999.
 * @author Sean A. Irvine
 */
public class A013999 implements Sequence {

  private long mN = -1;
  private Z mA = Z.ONE;
  private Z mB = Z.ONE;
  private Z mC = Z.TWO;

  @Override
  public Z next() {
    if (++mN <= 2) {
      if (mN < 2) {
        return Z.ONE;
      }
    } else {
      final Z t = mA.multiply(mN)
        .subtract(mB.multiply(2 * mN + 1))
        .add(mC.multiply(mN + 3));
      mA = mB;
      mB = mC;
      mC = t;
    }
    return mC;
  }
}
