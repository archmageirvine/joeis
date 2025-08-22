package irvine.oeis.a079;

import irvine.math.cr.CR;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A079586 Decimal expansion of Sum_{k&gt;=1} 1/F(k) where F(k) is the k-th Fibonacci number A000045(k).
 * @author Sean A. Irvine
 */
public class A079586 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A079586() {
    super(1, new CR() {
      @Override
      protected Z approximate(final int precision) {
        Z sum = Z.ZERO;
        final Z one = CR.ONE.getApprox(precision);
        long k = 0;
        while (true) {
          final Z invf = one.divide(Functions.FIBONACCI.z(++k));
          if (invf.isZero()) {
            return sum;
          }
          sum = sum.add(invf);
        }
      }
    });
  }
}
