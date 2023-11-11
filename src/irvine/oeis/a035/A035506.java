package irvine.oeis.a035;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A035506 Stolarsky array read by antidiagonals.
 * @author Sean A. Irvine
 */
public class A035506 extends Sequence0 {

  private static final CR TAU1 = CR.PHI.add(CR.ONE);
  private static final CR HALF_TAU = CR.PHI.divide(CR.TWO);
  private long mN = 0;
  private long mM = 0;

  /**
   * Compute an element of the Stolarsky triangle.
   * @param row row number
   * @param col column number
   * @return value
   */
  public static Z stolarsky(final long row, final long col) {
    Z a = TAU1.multiply(row).subtract(HALF_TAU).floor();
    if (col == 1) {
      return a;
    }
    Z b = CR.PHI.multiply(a).round();
    for (int k = 1; k < col - 1; ++k) {
      final Z d = a.add(b);
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
    return stolarsky(mM, mN - mM + 1);
  }
}

