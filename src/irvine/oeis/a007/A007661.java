package irvine.oeis.a007;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A007661.
 * @author Sean A. Irvine
 */
public class A007661 implements Sequence {

  private Z mA = Z.ONE;
  private Z mB = Z.ONE;
  private Z mC = Z.TWO;
  private long mN = -1;

  @Override
  public Z next() {
    if (++mN < 2) {
      return Z.ONE;
    } else if (mN > 2) {
      final Z t = mA.multiply(mN);
      mA = mB;
      mB = mC;
      mC = t;
    }
    return mC;
  }
}
