package irvine.oeis.a058;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A058525 Numbers z by which not all integers y, 0 &lt;= y &lt; 2^64, can be divided using "high multiplication" followed by a right shift.
 * @author Sean A. Irvine
 */
public class A058525 implements Sequence {

  private static final Z Z64 = Z.ONE.shiftLeft(64);
  private static final Z Z64M = Z64.subtract(1);
  private Z mN = Z.FIVE;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(2);
      final Z y = Z64M.subtract(Z64.mod(mN));
      final Z b = y.divide(mN);
      final int e = mN.bitLength() - 1;
      final Z a = Z.ONE.shiftLeft(64 + e).add(mN.subtract(1)).divide(mN);
      final Z c = a.multiply(y).shiftRight(64 + e);
      if (!c.equals(b)) {
        return mN;
      }
    }
  }
}
