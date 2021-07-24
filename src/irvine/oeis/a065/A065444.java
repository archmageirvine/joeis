package irvine.oeis.a065;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A065444 Decimal expansion of 9*Sum_{k&gt;=1} 1/(10^k-1).
 * @author Sean A. Irvine
 */
public class A065444 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A065444() {
    super(1, new CR() {
      @Override
      protected Z approximate(final int precision) {
        final Z one = Z.ONE.shiftLeft(-precision);
        Z sum = Z.ZERO;
        Z tens = Z.ONE;
        while (true) {
          tens = tens.multiply(10);
          final Z t = one.divide(tens.subtract(1));
          if (t.isZero()) {
            break;
          }
          sum = sum.add(t);
        }
        return sum;
      }
    }.multiply(9));
  }
}
