package irvine.oeis.a076;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A076214 Decimal expansion of C=sum(k&gt;=0,1/2^(2^k-1)).
 * @author Sean A. Irvine
 */
public class A076214 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A076214() {
    super(1, new CR() {
      @Override
      protected Z approximate(final int precision) {
        final Z one = Z.ONE.shiftLeft(-precision);
        Z sum = Z.ZERO;
        int k = -1;
        while (true) {
          final int shift = (1 << ++k) - 1;
          if (shift > -precision) {
            break;
          }
          sum = sum.add(one.shiftRight(shift));
        }
        return sum;
      }
    });
  }
}
