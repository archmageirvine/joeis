package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A000179.
 * @author Sean A. Irvine
 */
public class A000179 implements Sequence {

  private long mN = -1;
  private Z mA = Z.ZERO;
  private Z mB = Z.ONE;

  @Override
  public Z next() {
    if (++mN < 4) {
      if (mN == 1) {
        return Z.NEG_ONE;
      }
      return mN == 0 || mN == 3 ? Z.ONE : Z.ZERO;
    }
    final Z r = mB.multiply(mN * mN - 2 * mN)
      .add(mA.multiply(mN))
      .add((mN & 1) == 0 ? -4 : 4)
      .divide(mN - 2);
    mA = mB;
    mB = r;
    return r;
  }
}

