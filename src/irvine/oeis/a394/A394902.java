package irvine.oeis.a394;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A394902 Decimal expansion of the generalized continued fraction 1 + sqrt(1)/(2 + sqrt(2)/(3 + sqrt(3)/(4 + sqrt(4)/(5 + ...)))).
 * @author Sean A. Irvine
 */
public class A394902 extends DecimalExpansionSequence {

  private static Z build(final int n, final int precision) {
    final Z one = CR.ONE.getApprox(precision);
    Z t = Z.ZERO;
    for (long k = n; k > 0; --k) {
      t = CR.valueOf(k).sqrt().getApprox(precision).shiftLeft(-precision).divide(t.add(Z.valueOf(k + 1).shiftLeft(-precision)));
    }
    return t.add(one);
  }

  /** Construct the sequence. */
  public A394902() {
    super(1, new CR() {
      @Override
      protected Z approximate(final int precision) {
        int n = 5;
        while (true) {
          final Z lo = build(n, precision);
          final Z hi = build(n + 1, precision);
          if (lo.equals(hi)) {
            return lo;
          }
          n += 5;
        }
      }
    });
  }
}
