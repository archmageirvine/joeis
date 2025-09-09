package irvine.oeis.a080;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a049.A049384;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A080219 Decimal expansion of exponential factorial constant Sum_{n&gt;=1} 1/A049384(n).
 * @author Sean A. Irvine
 */
public class A080219 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A080219() {
    super(1, new CR() {
      @Override
      protected Z approximate(final int precision) {
        final Sequence seq = new A049384().skip();
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

