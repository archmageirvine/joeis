package irvine.oeis.a387;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A387983 allocated for Jason Bard.
 * @author Sean A. Irvine
 */
public class A387983 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A387983() {
    super(1, new CR() {
      @Override
      protected Z approximate(final int precision) {
        Z sum = Z.ZERO;
        final Z one = CR.ONE.getApprox(precision);
        long k = 0;
        while (true) {
          final Z t = one.divide(Z.valueOf(++k).pow(5 * k));
          if (t.isZero()) {
            return sum;
          }
          sum = sum.add(t);
        }
      }
    });
  }
}
