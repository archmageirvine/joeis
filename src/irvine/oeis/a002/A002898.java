package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A002898 Number of n-step closed paths on hexagonal lattice.
 * @author Sean A. Irvine
 */
public class A002898 extends Sequence0 {

  private int mN = -1;
  private Z mA = Z.ONE;
  private Z mB = Z.ZERO;
  private Z mC = Z.SIX;

  @Override
  public Z next() {
    switch (++mN) {
      case 0:
        return mA;
      case 1:
        return mB;
      case 2:
        return mC;
      default:
        final Z n3 = Z.valueOf(mN - 3);
        final Z n3s = n3.square();
        final Z t = mA.multiply(n3s.multiply(36).add(108L * mN - 252))
          .add(mB.multiply(n3s.multiply(24).add(96L * mN - 192)))
          .add(mC.multiply(n3s.add(5L * mN - 9)))
          .divide(n3s.add(6L * mN - 9));
        mA = mB;
        mB = mC;
        mC = t;
        return mC;
    }
  }
}

