package irvine.oeis.a393;

import irvine.math.cr.CR;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A393771 allocated for Paul D. Hanna.
 * @author Sean A. Irvine
 */
public class A393771 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A393771() {
    super(0, new CR() {
      @Override
      protected Z approximate(final int precision) {
        final Z one = CR.ONE.getApprox(precision);
        Z sum = Z.ZERO;
        long k = -1;
        while (true) {
          ++k;
          // Test like this because cos() can be 0
          final Z d = Functions.FACTORIAL.z(k).shiftLeft(k * k);
          if (one.divide(d).isZero()) {
            return sum;
          }
          final Z t = CR.TAU.divide(Z.ONE.shiftLeft(k)).cos().divide(d).getApprox(precision);
          sum = sum.add(t);
        }
      }
    });
  }
}
