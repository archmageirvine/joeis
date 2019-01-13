package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A001003.
 * @author Sean A. Irvine
 */
public class A001003 implements Sequence {

  protected int mN = -1;
  private Z mA = Z.ONE;
  private Z mB = Z.ONE;

  @Override
  public Z next() {
    if (++mN < 2) {
      return Z.ONE;
    }
    final Z t = mB.multiply(6L * mN - 3)
      .subtract(mA.multiply(mN - 2L))
      .divide(mN + 1L);
    mA = mB;
    mB = t;
    return t;
  }
}
