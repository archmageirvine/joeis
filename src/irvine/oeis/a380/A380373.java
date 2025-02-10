package irvine.oeis.a380;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a082.A082851;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A380373 Decimal expansion of Sum_{i&gt;=1} 1/2^A082851(i).
 * @author Sean A. Irvine
 */
public class A380373 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A380373() {
    super(0, new CR() {
      @Override
      protected Z approximate(final int precision) {
        final Sequence seq = new A082851();
        final Z one = CR.ONE.getApprox(precision);
        Z sum = Z.ZERO;
        while (true) {
          final Z t = one.shiftRight(seq.next().longValueExact());
          if (t.isZero()) {
            return sum;
          }
          sum = sum.add(t);
        }
      }
    });
  }
}
