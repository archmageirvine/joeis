package irvine.oeis.a085;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A085630 Number of n-digit 7-smooth numbers (A002473).
 * @author Sean A. Irvine
 */
public class A085630 extends Sequence0 {

  private static final CR LOG3 = CR.THREE.log();
  private static final CR LOG5 = CR.FIVE.log();
  private static final CR LOG7 = CR.SEVEN.log();
  private int mN = -1;

  private Z b(final Z m) {
    final long end = CR.valueOf(m).log().divide(LOG7).floor().longValueExact();
    Z sum = Z.ZERO;
    for (long i = 0; i <= end; ++i) {
      final Z p = m.divide(Z.SEVEN.pow(i));
      final long endP = CR.valueOf(p).log().divide(LOG5).floor().longValueExact();
      for (long j = 0; j <= endP; ++j) {
        final Z q = p.divide(Z.FIVE.pow(j));
        final long endQ = CR.valueOf(q).log().divide(LOG3).floor().longValueExact();
        for (long k = 0; k <= endQ; ++k) {
          sum = sum.add(q.divide(Z.THREE.pow(k)).bitLength());
        }
      }
    }
    return sum;
  }

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ZERO;
    }
    return b(Z.TEN.pow(mN).subtract(1)).subtract(mN > 1 ? b(Z.TEN.pow(mN - 1).subtract(1)) : Z.ZERO);
  }
}
