package irvine.oeis.a086;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A086648 Decimal expansion of the Sum_{k&gt;=1} k^(-2*k).
 * @author Sean A. Irvine
 */
public class A086648 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A086648() {
    super(1, new CR() {
      @Override
      protected Z approximate(final int precision) {
        final Z one = CR.ONE.getApprox(precision);
        Z sum = Z.ZERO;
        long k = 0;
        while (true){
          final Z t = one.divide(Z.valueOf(++k).pow(2 * k));
          if (t.isZero()) {
            return sum;
          }
          sum = sum.add(t);
        }
      }
    });
  }
}

