package irvine.oeis.a071;

import irvine.math.cr.CR;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A071815 Decimal expansion of Sum_{k&gt;=1} d(k!)/k! where d is the number of divisors function.
 * @author Sean A. Irvine
 */
public class A071815 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A071815() {
    super(new CR() {
      @Override
      protected Z approximate(final int precision) {
        Z sum = Z.ZERO;
        int k = 0;
        Z f = Z.ONE;
        while (true) {
          f = f.multiply(++k);
          final Z u = Functions.SIGMA0.z(f).shiftLeft(-precision).divide(f);
          if (u.isZero()) {
            return sum;
          }
          sum = sum.add(u);
        }
      }
    });
  }
}
