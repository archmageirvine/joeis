package irvine.oeis.a077;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a003.A003096;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A077094.
 * @author Sean A. Irvine
 */
public class A077124 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A077124() {
    super(1, new CR() {
      @Override
      protected Z approximate(final int precision) {
        final Sequence s = new A003096();
        long k = 0;
        Z t = Z.ZERO;
        while (true) {
          final Z u = CR.valueOf(s.next()).pow(new Q(1, Z.ONE.shiftLeft(++k))).getApprox(precision);
          if (u.equals(t)) {
            return u;
          }
          t = u;
        }
      }
    });
  }
}

