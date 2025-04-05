package irvine.math.cr.functions;

import irvine.math.cr.CR;
import irvine.math.z.Z;

/**
 * The lower incomplete gamma function.
 * @author Sean A. Irvine
 */
class LowerIncompleteGammaFunction extends CrFunction2Cr {

  private static final int EXTRA_PRECISION = 3;

  @Override
  public CR cr(final CR v, final CR z) {
    // sum (-1)^k * z^{v+k} / k! / (v+k), k >= 0
    return new CR() {
      @Override
      protected Z approximate(final int precision) {
        final int p = precision - EXTRA_PRECISION;
        final Z zv = v.getApprox(p);
        final Z zz = z.getApprox(p);
        final Z one = CR.ONE.getApprox(p);
        Z zvk = z.pow(v).getApprox(2 * p);
        Z fk = Z.ONE;
        Z d = zv;
        Z sum = zvk.divide(d);
        long k = 0;
        while (true) {
          fk = fk.multiply(++k);
          zvk = scale(zvk.multiply(zz), p);
          d = d.add(one);
          final Z term = zvk.divide(d.multiply(fk));
          //System.out.println("term=" + term);
          if (term.isZero()) {
            break;
          }
          sum = sum.signedAdd((k & 1) == 0, term);
        }
        return scale(sum, -EXTRA_PRECISION);
      }
    };
  }
}
