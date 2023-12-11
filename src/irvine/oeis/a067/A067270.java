package irvine.oeis.a067;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence1;

/**
 * A067270 Numbers m such that m-th triangular number (A000217) ends in m.
 * @author Sean A. Irvine
 */
public class A067270 extends Sequence1 {

  // After Chai Wah Wu

  private static final Z[] A1 = {Z.ZERO, Z.ONE};
  private static final Z[] A2 = {Z.ONE, Z.ZERO};
  private final Z[] mM = {Z.TWO, Z.ONE};
  private Z mA = null;

  @Override
  public Z next() {
    if (mA == null) {
      mA = Z.NEG_ONE;
      return Z.ZERO;
    } else if (mA.signum() < 0) {
      mA = Z.ZERO;
      return Z.ONE;
    }
    while (true) {
      mM[0] = mM[0].multiply2();
      mM[1] = mM[1].multiply(5);
      final Z b = ZUtils.chineseRemainderTheorem(A1, mM).min(ZUtils.chineseRemainderTheorem(A2, mM));
      if (b.compareTo(mA) > 0) {
        mA = b;
        return mA;
      }
    }
  }
}
