package irvine.oeis.a365;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A365066 Decimal expansion of the constant 1/0! - 1/1! + 1/2! + 1/3! - 1/4! + 1/5! + 1/6! - 1/7! + ...
 * @author Sean A. Irvine
 */
public class A365066 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A365066() {
    super(0, new CR() {
      @Override
      protected Z approximate(final int precision) {
        Z sum = Z.ZERO;
        Z f = Z.ONE;
        final Z one = Z.ONE.shiftLeft(-precision);
        long k = -1;
        while (true) {
          if (++k > 1) {
            f = f.multiply(k);
          }
          final Z t = one.divide(f);
          if (t.isZero()) {
            return sum;
          }
          sum = sum.signedAdd(k % 3 != 1, t);
        }
      }
    });
  }
}

