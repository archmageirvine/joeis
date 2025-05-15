package irvine.oeis.a383;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a055.A055777;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A383817 allocated for Artur Jasinski.
 * @author Sean A. Irvine
 */
public class A383817 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A383817() {
    super(0, new CR() {
      @Override
      protected Z approximate(final int precision) {
        final Sequence s = new A055777();
        Z sum = Z.ZERO;
        while (true) {
          final Z t = CR.ONE.divide(s.next()).getApprox(precision);
          if (t.isZero()) {
            return sum;
          }
          sum = sum.add(t);
        }
      }
    });
  }
}
