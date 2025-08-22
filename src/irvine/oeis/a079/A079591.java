package irvine.oeis.a079;

import irvine.math.cr.CR;
import irvine.math.cr.UnaryCrFunction;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A079591 Decimal expansion of x such that Sum_{k&gt;=1} x^Fibonacci(k) = 1.
 * @author Sean A. Irvine
 */
public class A079591 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A079591() {
    super(1, new UnaryCrFunction() {
      @Override
      public CR execute(final CR x) {
        return new CR() {
          @Override
          protected Z approximate(final int precision) {
            Z sum = Z.ZERO;
            long k = 0;
            while (true) {
              final Z t = x.pow(CR.valueOf(Functions.FIBONACCI.z(++k))).getApprox(precision);
              if (t.isZero()) {
                return sum;
              }
              sum = sum.add(t);
            }
          }
        }.subtract(CR.ONE);
      }
    }.inverseMonotone(CR.ZERO, CR.HALF).execute(CR.ZERO));
  }
}
