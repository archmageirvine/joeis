package irvine.oeis.a052;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A052131 Decimal expansion of conjectured limit of ratio of successive terms of A052109.
 * @author Sean A. Irvine
 */
public class A052131 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A052131() {
    super(new CR() {
      @Override
      protected Z approximate(final int precision) {
        final Sequence seq = new A052109();
        Z a = seq.next();
        Z z = Z.ZERO;
        while (true) {
          Z b = a;
          a = seq.next();
          final Z t = CR.valueOf(new Q(a, b)).getApprox(precision);
          if (t.equals(z)) {
            return t;
          }
          z = t;
        }
      }
    });
  }
}
