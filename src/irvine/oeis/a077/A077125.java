package irvine.oeis.a077;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a007.A007018;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A077125 Decimal expansion of the constant c such that A007018(n)=floor(c^(2^n)).
 * @author Sean A. Irvine
 */
public class A077125 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A077125() {
    super(1, new CR() {
      @Override
      protected Z approximate(final int precision) {
        final Sequence s = new A007018();
        long k = -1;
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

