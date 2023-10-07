package irvine.oeis.a195;

import irvine.math.cr.CR;
import irvine.math.cr.UnaryCRFunction;
import irvine.math.z.Z;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A195202 Unique constant x that satisfies: x = Sum_{n&gt;=1} 1/floor(x^n).
 * @author Sean A. Irvine
 */
public class A195202 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A195202() {
    super(1, new UnaryCRFunction() {
      @Override
      public CR execute(final CR x) {
        return new CR() {
          @Override
          protected Z approximate(final int precision) {
            final Z one = Z.ONE.shiftLeft(-precision);
            Z sum = Z.ZERO;
            int k = 0;
            while (true) {
              final Z t = one.divide(x.pow(++k).floor());
              if (t.isZero()) {
                return sum;
              }
              sum = sum.add(t);
            }
          }
        }.subtract(x);
      }
    }.inverseMonotone(CR.valueOf(1.5), CR.TWO).execute(CR.ZERO));
  }
}
