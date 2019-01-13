package irvine.oeis.a005;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A005814.
 * @author Sean A. Irvine
 */
public class A005814 implements Sequence {

  private Z[] mA = {Z.ONE, Z.TWO, Z.valueOf(47), Z.valueOf(4720)};
  private long mN = -1;

  @Override
  public Z next() {
    if (++mN < 4) {
      return mA[(int) mN];
    }
    final Z t = mA[0].multiply(2 * mN - 1).multiply(2 * mN - 3).multiply(2 * mN - 5).multiply(2 * mN - 7).multiply(mN).multiply(mN - 1).multiply(mN - 3).multiply2()
      .subtract(mA[1].multiply(3 * mN - 2).multiply(2 * mN - 1).multiply(2 * mN - 3).multiply(2 * mN - 5).multiply(mN).multiply(mN - 2).multiply2())
      .add(mA[2].multiply(12 * mN - 1).multiply(2 * mN - 1).multiply(2 * mN - 3).multiply(mN - 1))
      .add(mA[3].multiply(2 * mN - 1).multiply(mN).multiply(mN - 1).multiply(9))
      .divide(3);
    mA[0] = mA[1];
    mA[1] = mA[2];
    mA[2] = mA[3];
    mA[3] = t;
    return t;
  }
}

