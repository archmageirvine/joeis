package irvine.oeis.a074;

import irvine.math.cr.CR;
import irvine.math.cr.UnaryCrFunction;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A074694 Decimal expansion of the solution x of phi^x = lim_{n -&gt; infinity} (1/n)*Sum_{k=1..n} (Fibonacci(k+1)/Fibonacci(k))^x where phi is the golden ratio = (1 + sqrt(5))/2.
 * @author Sean A. Irvine
 */
public class A074694 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A074694() {
    super(1, new UnaryCrFunction() {
      @Override
      public CR execute(final CR x) {
        return new CR() {
          @Override
          protected Z approximate(final int precision) {
            Z sum = Z.ZERO;
            long k = 0;
            Z u = Z.ZERO;
            while (true) {
              final CR t = CR.valueOf(Functions.FIBONACCI.z(++k + 1)).divide(Functions.FIBONACCI.z(k)).pow(x);
              final Z a = t.getApprox(precision);
              sum = sum.add(a);
              if (u.equals(a)) {
                break;
              }
              u = a;
            }
            return sum.divide(k);
          }
        }.subtract(CR.PHI.pow(x));
      }
    }.inverseMonotone(CR.THREE, CR.FOUR).execute(CR.ZERO));
  }
}
