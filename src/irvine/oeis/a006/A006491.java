package irvine.oeis.a006;

import irvine.math.z.Z;
import irvine.oeis.a000.A000045;

/**
 * A006491 Generalized Lucas numbers.
 * @author Sean A. Irvine
 */
public class A006491 extends A000045 {

  {
    setOffset(1);
  }

  private long mN = 0;
  private Z mA = Z.ONE;
  private Z mB = Z.ZERO;
  private Z mF = super.next();

  @Override
  public Z next() {
    if (++mN == 1) {
      return Z.ONE;
    } else if (mN >= 3) {
      final Z f = mF;
      mF = super.next();
      final Z t = mA.add(mB).add(mF.multiply(mN)).subtract(f.multiply(mN - 1));
      mA = mB;
      mB = t;
    }
    return mB;
  }
}

