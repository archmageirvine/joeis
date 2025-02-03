package irvine.math.cr.functions;

import irvine.math.cr.CR;
import irvine.math.z.Z;

/**
 * The Minkowski question mark function.
 * @author Sean A. Irvine
 */
class MinkowskiQuestionMark extends CrFunction1 {

  private static final int EXTRA_PRECISION = 5;

  @Override
  public CR cr(final CR z) {
    return new CR() {
      @Override
      protected Z approximate(final int prec) {
        if (prec >= 0) {
          return Z.ZERO;
        }
        final int opPrec = EXTRA_PRECISION - prec;
        final Z x = z.getApprox(-opPrec);
        Z p = z.floor();
        Z r = p.add(1);
        Z q = Z.ONE;
        Z s = Z.ONE;
        Z d = Z.ONE.shiftLeft(opPrec);
        Z y = p.shiftLeft(opPrec);

        for (int k = 0; k <= opPrec; ++k) {
          d = d.divide2();
          final Z m = p.add(r);
          final Z n = q.add(s);
          if (x.multiply(n).compareTo(m.shiftLeft(opPrec)) < 0) {
            r = m;
            s = n;
          } else {
            y = y.add(d);
            p = m;
            q = n;
          }
        }
        return y.add(d).shiftRight(EXTRA_PRECISION);
      }
    };
  }
}
