package irvine.oeis.a386;

import irvine.math.cr.CR;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A386440 allocated for Jason Bard.
 * @author Sean A. Irvine
 */
public class A386440 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A386440() {
    super(0, new CR() {
      @Override
      protected Z approximate(final int precision) {
        final Z one = CR.ONE.getApprox(precision);
        Z sum = Z.ZERO;
        long k = 0;
        while (true) {
          k += 8;
          final Z f = one.divide(Functions.FACTORIAL.z(k));
          if (f.isZero()) {
            return sum;
          }
          sum = sum.add(f);
        }
      }
    });
  }
}
