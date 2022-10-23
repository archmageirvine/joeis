package irvine.oeis.a023;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A023427 Number of Dyck n-paths with ascents and descents of length equal to 1 (mod 4).
 * @author Sean A. Irvine
 */
public class A023427 extends Sequence0 {

  private Z[] mA = {Z.ONE, Z.ONE, Z.ONE, Z.ONE, Z.ONE, Z.TWO, Z.FOUR, Z.SEVEN};
  private int mN = -1;

  @Override
  public Z next() {
    if (++mN < mA.length) {
      return mA[mN];
    }
    final Z t = mA[7].multiply(2L * mN + 5)
      .subtract(mA[6].multiply(mN + 1))
      .add(mA[4].multiply(2L * mN - 4))
      .add(mA[3].multiply(2L * mN - 7))
      .subtract(mA[0].multiply(mN - 8))
      .divide(mN + 4);
    System.arraycopy(mA, 1, mA, 0, mA.length - 1);
    mA[7] = t;
    return t;
  }
}

