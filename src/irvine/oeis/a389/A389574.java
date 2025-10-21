package irvine.oeis.a389;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a033.A033307;
import irvine.oeis.a388.A388856;

/**
 * A389574 Increasing partition array based on the tails of the Champernowne constant (A033307); see Comments.
 * @author Sean A. Irvine
 */
public class A389574 extends A388856 {

  static CR champerknowneShiftedFrac(final long m) {
    return new CR() {
      @Override
      protected Z approximate(final int precision) {
        final Sequence s = new A033307().skip(m - 1);
        Z sum = Z.ZERO;
        final Z one = CR.ONE.getApprox(precision);
        Z m = Z.TEN;
        while (true) {
          final Z v = s.next();
          if (!v.isZero()) {
            final Z t = one.multiply(v).divide(m);
            if (t.isZero()) {
              return sum;
            }
            sum = sum.add(t);
          }
          m = m.multiply(10);
        }
      }
    };
  }

  /** Construct the sequence. */
  public A389574() {
    super(A389574::champerknowneShiftedFrac);
  }
}

