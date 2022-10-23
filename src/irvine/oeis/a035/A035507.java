package irvine.oeis.a035;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A035507 Inverse Stolarsky array read by antidiagonals.
 * @author Sean A. Irvine
 */
public class A035507 extends Sequence0 {

  private static final CR HALF_TAU = CR.PHI.divide(CR.TWO);
  private long mN = 0;
  private long mM = 0;

  protected Z inverseStolarsky(final long row, final long col) {
    Z a = row == 1 ? Z.ONE : CR.PHI.multiply(row - 1).round();
    if (col == 1) {
      return a;
    }
    Z b = HALF_TAU.multiply(a.multiply(2).add(1)).floor().add(a).add(1);
    for (int k = 1; k < col - 1; ++k) {
      final Z d = b.multiply(3).subtract(a).add(1);
      a = b;
      b = d;
    }
    return b;
  }

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 1;
    }
    return inverseStolarsky(mN - mM + 1, mM);
  }
}

