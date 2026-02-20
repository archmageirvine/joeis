package irvine.oeis.a195;

import irvine.math.cr.CR;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A195070 Sum_{k&gt;=0} 1/(10k)!.
 * @author Sean A. Irvine
 */
public class A195070 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A195070() {
    super(1, new CR() {
      @Override
      protected Z approximate(final int precision) {
        final Z one = CR.ONE.getApprox(precision);
        Z sum = Z.ZERO;
        long k = -10;
        while (true) {
          k += 10;
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
