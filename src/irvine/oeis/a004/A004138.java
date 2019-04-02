package irvine.oeis.a004;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A004138 From a counter moving problem.
 * @author Sean A. Irvine
 */
public class A004138 implements Sequence {

  private Z mA = null;
  private Z mB = null;
  private Z mC = null;
  private Z mD = null;

  @Override
  public Z next() {
    if (mD == null) {
      if (mA == null) {
        mA = Z.ONE;
        return Z.ONE;
      }
      if (mB == null) {
        mB = Z.TWO;
        return Z.TWO;
      }
      if (mC == null) {
        mC = Z.THREE;
        return Z.THREE;
      }
      mD = Z.EIGHT;
    } else {
      final Z t = mD.add(mC).subtract(mB).add(mA.multiply2()).add(2);
      mA = mB;
      mB = mC;
      mC = mD;
      mD = t;
    }
    return mD;
  }
}
