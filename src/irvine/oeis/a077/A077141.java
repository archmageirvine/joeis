package irvine.oeis.a077;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000289;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A077141 Decimal expansion of the constant c such that A000289(n) = ceiling(c^(2^n)) + 1.
 * @author Sean A. Irvine
 */
public class A077141 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A077141() {
    super(1, new CR() {
      @Override
      protected Z approximate(final int precision) {
        final Sequence s = new A000289().skip();
        long k = 0;
        Z t = Z.ZERO;
        while (true) {
          final Z u = CR.valueOf(s.next().subtract(1)).pow(new Q(1, Z.ONE.shiftLeft(++k))).getApprox(precision);
          if (u.equals(t)) {
            return u;
          }
          t = u;
        }
      }
    });
  }
}

