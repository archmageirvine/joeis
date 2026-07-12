package irvine.oeis.a085;

import irvine.math.cr.CR;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A085825 Decimal expansion of number with continued fraction 2 + 3/5 + 7/11 + 13/17 + 19/23 + ...
 * @author Sean A. Irvine
 */
public class A085825 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A085825() {
    super(1, new CR() {

      private Z build(final long k, final int s) {
        Z sum = Z.ZERO;
        for (long j = k; j >= 1; --j) {
          sum = Functions.PRIME.z(2 * j).shiftLeft(2L * s).divide(Functions.PRIME.z(2 * j + 1).shiftLeft(s).add(sum));
        }
        return sum;
      }

      @Override
      protected Z approximate(final int precision) {
        long k = 1;
        Z prev = Z.ZERO;
        while (true) {
          k *= 2;
          final Z sum = build(k, -precision);
          if (sum.equals(prev)) {
            return sum;
          }
          prev = sum;
        }
      }
    }.add(2));
  }
}
