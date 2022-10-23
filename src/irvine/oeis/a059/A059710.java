package irvine.oeis.a059;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A059710 Dimension of space of invariants of n-th tensor power of 7-dimensional irreducible representation of G_2. Also the number of n-leaf, otherwise trivalent graphs in a disk such that all faces have at least 6 sides.
 * @author Sean A. Irvine
 */
public class A059710 extends Sequence0 {

  private long mN = -1;
  private Z mA = Z.ONE;
  private Z mB = Z.ZERO;
  private Z mC = Z.ONE;

  @Override
  public Z next() {
    if (++mN <= 2) {
      return mN == 1 ? Z.ZERO : Z.ONE;
    }
    final Z t = mC.multiply(2 * mN + 5).multiply(2 * mN - 2)
      .add(mB.multiply(19 * mN + 18).multiply(mN - 1))
      .add(mA.multiply(mN - 2).multiply(14 * mN - 14))
      .divide(mN + 5)
      .divide(mN + 6);
    mA = mB;
    mB = mC;
    mC = t;
    return t;
  }
}
