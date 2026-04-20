package irvine.oeis.a084;

import irvine.math.cr.CR;
import irvine.math.cr.UnaryCrFunction;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A084257 Decimal expansion of -x where x^2/2! + x^3/3! + x^5/5! + x^7/7! + x^11/11! + x^13/13! + ... = 0.
 * @author Sean A. Irvine
 */
public class A084257 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A084257() {
    super(1, new UnaryCrFunction() {
      @Override
      public CR execute(final CR x) {
        return new CR() {
          @Override
          protected Z approximate(final int precision) {
            Z sum = Z.ZERO;
            long p = 1;
            while (true) {
              p = Functions.NEXT_PRIME.l(p);
              final Z t = x.pow(p).divide(Functions.FACTORIAL.z(p)).getApprox(precision);
              if (t.isZero()) {
                return sum;
              }
              sum = sum.add(t);
            }
          }
        };
      }
    }.inverseMonotone(CR.valueOf(-3), CR.valueOf(-2)).execute(CR.ZERO).negate());
  }
}
