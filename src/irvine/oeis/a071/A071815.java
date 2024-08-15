package irvine.oeis.a071;

import irvine.math.cr.CR;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A071815 Decimal expansion of Sum(k = 0 to inf; d(n!)/n!).
 * @author Sean A. Irvine
 */
public class A071815 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A071815() {
    super(new CR() {
      @Override
      protected Z approximate(final int precision) {
        Z sum = Z.ZERO;
        if (precision < 0) {
          int k = 0;
          Z f = Z.ONE;
          Z u;
          do {
            f = f.multiply(++k);
            u = Functions.SIGMA0.z(f).shiftLeft(-precision).divide(f);
            sum = sum.add(u);
          } while (!u.isZero());
        }
        return sum;
      }
    });
  }
}
