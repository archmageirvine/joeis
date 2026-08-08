package irvine.oeis.a086;

import irvine.math.cr.CR;
import irvine.math.cr.Zeta;
import irvine.math.z.Z;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A086242 Decimal expansion of the sum of 1/(p-1)^2 over all primes p.
 * @author Sean A. Irvine
 */
public class A086242 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A086242() {
    super(1, new CR() {
      @Override
      protected Z approximate(final int precision) {
        Z sum = Z.ZERO;
        int k = 1;
        while (true) {
          final Z t = Zeta.zetap(++k).multiply(k - 1).getApprox(precision);
          if (t.isZero()) {
            return sum;
          }
          sum = sum.add(t);
        }
      }
    });
  }
}
