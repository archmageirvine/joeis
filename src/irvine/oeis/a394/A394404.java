package irvine.oeis.a394;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A394404 allocated for Maya S. Popova.
 * @author Sean A. Irvine
 */
public class A394404 extends DecimalExpansionSequence {

  private static Z build(final int n, final int precision) {
    Z one = CR.ONE.getApprox(precision);
    Z t = Z.ZERO;
    for (long k = n; k > 1; --k) {
      t = CR.valueOf(k).sqrt().getApprox(precision).shiftLeft(-precision).divide(t.add(Z.valueOf(k).shiftLeft(-precision)));
    }
    return t.add(one);
  }

  /** Construct the sequence. */
  public A394404() {
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
