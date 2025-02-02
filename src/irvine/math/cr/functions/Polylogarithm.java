package irvine.math.cr.functions;

import irvine.math.cr.CR;
import irvine.math.z.Z;

/**
 * The polylogarithm.
 * Probably only effective for larger <code>v</code>.
 * @author Sean A. Irvine
 */
class Polylogarithm extends CrFunction2 {

  @Override
  public CR cr(final int v, final CR z) {
    return new CR() {
      @Override
      protected Z approximate(final int precision) {
        Z sum = Z.ZERO;
        final Z x = z.getApprox(precision);
        long k = 0;
        Z zk = CR.ONE.getApprox(precision);
        while (true) {
          zk = zk.multiply(x).shiftRight(-precision);
          final Z term = zk.divide(Z.valueOf(++k).pow(v));
          if (term.isZero()) {
            break;
          }
          sum = sum.add(term);
        }
        return sum;
      }
    };
  }
}
