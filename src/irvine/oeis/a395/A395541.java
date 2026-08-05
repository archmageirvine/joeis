package irvine.oeis.a395;

import irvine.math.cr.CR;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A395541 Largest integer of the form r^k whose product of nonzero base-n digits is r and whose number of base-n digits is k.
 * @author Sean A. Irvine
 */
public class A395541 extends Sequence2 {

  private long mN = 1;

  @Override
  public Z next() {
    ++mN;
    final CR logn = CR.valueOf(mN).log();
    Z best = Z.NEG_ONE;
    for (long r = 1; r < mN; ++r) {
      final long kMax = r == 1 ? 1 : CR.ONE.subtract(CR.valueOf(r).log().divide(logn)).inverse().floor().longValueExact();
      Z rk = Z.ONE;
      for (long k = 1; k <= kMax; ++k) {
        rk = rk.multiply(r);
        if (Functions.DIGIT_LENGTH.l(mN, rk) != k) {
          continue;
        }
        if (Functions.DIGIT_NZ_PRODUCT.z(mN, rk).equals(r)) {
          if (rk.compareTo(best) > 0) {
            best = rk;
          }
        }
      }
    }
    return best;
  }
}
