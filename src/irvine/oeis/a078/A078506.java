package irvine.oeis.a078;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000041;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A078506 Decimal expansion of sum of inverses of unrestricted partition function.
 * @author Sean A. Irvine
 */
public class A078506 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A078506() {
    super(1, new CR() {
      @Override
      protected Z approximate(final int precision) {
        final Sequence seq = new A000041().skip();
        final Z one = CR.ONE.getApprox(precision);
        Z sum = Z.ZERO;
        while (true) {
          final Z t = one.divide(seq.next());
          if (t.isZero()) {
            return sum;
          }
          sum = sum.add(t);
        }
      }
    });
  }
}
