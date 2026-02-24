package irvine.oeis.a076;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000058;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A076393 Decimal expansion of Vardi constant arising in the Sylvester sequence.
 * @author Sean A. Irvine
 */
public class A076393 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A076393() {
    super(1, new CR() {
      @Override
      protected Z approximate(final int precision) {
        final Sequence a = new A000058();
        Z sum = Z.ZERO;
        long k = 0;
        while (true) {
          final Z t = CR.ONE.add(CR.valueOf(a.next().multiply2().subtract(1).square()).inverse()).log().getApprox(precision).shiftRight(++k);
          if (t.isZero()) {
            return sum;
          }
          sum = sum.add(t);
        }
      }
    }.exp().multiply(new Q(3, 2)).sqrt());
  }
}
