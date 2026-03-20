package irvine.oeis.a393;

import irvine.math.cr.CR;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A393772 Imaginary part of Sum_{n&gt;=0} (2*Pi*i + 1/2^n)^n / n!.
 * @author Sean A. Irvine
 */
public class A393772 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A393772() {
    super(0, new CR() {
      @Override
      protected Z approximate(final int precision) {
        final Z one = CR.ONE.getApprox(precision);
        Z sum = Z.ZERO;
        long k = -1;
        while (true) {
          ++k;
          // Test like this because sin() can be 0
          final Z d = Functions.FACTORIAL.z(k).shiftLeft(k * k);
          if (one.divide(d).isZero()) {
            return sum;
          }
          final Z t = CR.TAU.divide(Z.ONE.shiftLeft(k)).sin().divide(d).getApprox(precision);
          sum = sum.add(t);
        }
      }
    });
  }
}
