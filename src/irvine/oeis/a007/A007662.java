package irvine.oeis.a007;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A007662.
 * @author Sean A. Irvine
 */
public class A007662 implements Sequence {

  private Z mA = Z.ONE;
  private Z mB = Z.ONE;
  private Z mC = Z.TWO;
  private Z mD = Z.THREE;
  private long mN = -1;

  @Override
  public Z next() {
    if (++mN <= 2) {
      return mN < 2 ? Z.ONE : Z.TWO;
    } else if (mN > 3) {
      final Z t = mA.multiply(mN);
      mA = mB;
      mB = mC;
      mC = mD;
      mD = t;
    }
    return mD;
  }
}
