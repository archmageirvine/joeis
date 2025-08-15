package irvine.oeis.a079;

import irvine.math.cr.CR;
import irvine.math.cr.UnaryCrFunction;
import irvine.math.function.Functions;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A079459 Decimal expansion of constant C &gt; 0 such that Sum_{k&gt;=1} C^k! = 1.
 * @author Sean A. Irvine
 */
public class A079459 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A079459() {
    super(0, new UnaryCrFunction() {
      @Override
      public CR execute(final CR x) {
        return new CR() {
          @Override
          protected Z approximate(final int precision) {
            Z c = Z.ZERO;
            long k = 0;
            while (true) {
              final Z t = x.pow(CR.valueOf(Functions.FACTORIAL.z(++k))).getApprox(precision);
              if (t.isZero()) {
                return c;
              }
              c = c.add(t);
            }
          }
        }.subtract(CR.ONE);
      }
    }.inverseMonotone(CR.HALF, CR.valueOf(new Q(6, 10))).execute(CR.ZERO));
  }
}
