package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A002816 Number of polygons that can be formed from n points on a circle, no two adjacent.
 * @author Sean A. Irvine
 */
public class A002816 extends Sequence1 {

  private final Z[] mA = {Z.valueOf(23), Z.ONE, Z.ZERO, Z.ZERO, Z.ZERO, Z.ONE, Z.THREE};
  private long mN = 0;

  private Z a(final long n) {
    return mA[(int) ((n + mA.length) % mA.length)];
  }

  @Override
  public Z next() {
    final Z res = a(++mN);
    // We compute term m (the next replacement for term mN in the buffer)
    final long m = mN + mA.length;
    final Z n = Z.valueOf(m);
    final Z t = a(m - 1).multiply(n.subtract(8).multiply(n).add(18).multiply(n).subtract(21))
      .add(a(m - 2).multiply(n).multiply(m - 5).shiftLeft(2))
      .subtract(a(m - 3).multiply(n.subtract(5).multiply(n).add(3)).multiply(m - 6).multiply2())
      .add(a(m - 4).multiply(n.subtract(7).multiply(n).add(9)))
      .add(a(m - 5).multiply(n.subtract(5).multiply(n).add(3)).multiply(m - 5))
      .divide(n.subtract(7).multiply(n).add(9));
    mA[(int) (mN % mA.length)] = t;
    return res;
  }
}

