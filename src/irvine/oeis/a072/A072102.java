package irvine.oeis.a072;

import irvine.math.cr.CR;
import irvine.math.cr.Zeta;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A072102 Decimal expansion of sum of reciprocal perfect powers (excluding 1).
 * @author Sean A. Irvine
 */
public class A072102 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A072102() {
    super(0, new CR() {
      @Override
      protected Z approximate(final int precision) {
        Z sum = Z.ZERO;
        final Z one = Z.ONE.shiftLeft(-precision);
        int k = 1;
        while (true) {
          final int m = Functions.MOBIUS.i(++k);
          if (m != 0) {
            final Z t = one.subtract(Zeta.zeta(k).getApprox(precision));
            if (t.isZero()) {
              return sum;
            }
            sum = sum.signedAdd(m == 1, t);
          }
        }
      }
    });
  }
}
