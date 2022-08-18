package irvine.oeis.a160;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A160387 Decimal expansion of 4^5 * Sum_{n&gt;=0} 1/4^(2^n).
 * @author Sean A. Irvine
 */
public class A160387 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A160387() {
    super(3, new CR() {
      @Override
      protected Z approximate(final int precision) {
        final Z one = Z.ONE.shiftLeft(-precision);
        Z sum = Z.ZERO;
        int k = -1;
        while (true) {
          final int shift = 1 << ++k;
          final Z t = one.shiftRight(2 * shift);
          if (t.isZero()) {
            break;
          }
          sum = sum.add(t);
        }
        return sum;
      }
    }.multiply(1024));
  }
}
