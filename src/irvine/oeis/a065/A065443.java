package irvine.oeis.a065;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A065443 Decimal expansion of Sum_{k=1..inf} 1/(2^k-1)^2.
 * @author Sean A. Irvine
 */
public class A065443 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A065443() {
    super(1, new CR() {
      @Override
      protected Z approximate(final int precision) {
        final Z one = Z.ONE.shiftLeft(-precision);
        Z sum = Z.ZERO;
        int k = 0;
        while (true) {
          final Z t = one.divide(Z.ONE.shiftLeft(++k).subtract(1).square());
          if (t.isZero()) {
            break;
          }
          sum = sum.add(t);
        }
        return sum;
      }
    });
  }
}
