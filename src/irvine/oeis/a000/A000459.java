package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A000459.
 * @author Sean A. Irvine
 */
public class A000459 implements Sequence {

  protected int mN = -1;
  private Z mA = null;
  private Z mB = null;

  @Override
  public Z next() {
    ++mN;
    if (mA == null) {
      mA = Z.ONE;
      return Z.ONE;
    }
    if (mB == null) {
      mB = Z.ZERO;
      return Z.ZERO;
    }
    final Z t = mB.multiply(2 * mN - 1).multiply(mN)
      .add(mA.multiply(mN - 1).multiply(mN).multiply2())
      .subtract(2 * mN - 1);
    mA = mB;
    mB = t;
    return t;
  }
}
