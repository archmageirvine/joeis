package irvine.oeis.a389;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a030.A030190;
import irvine.oeis.a388.A388856;

/**
 * A389576 allocated for Clark Kimberling.
 * @author Sean A. Irvine
 */
public class A389576 extends A388856 {

  static CR champerknowneBase2ShiftedFrac(final long m) {
    return new CR() {
      @Override
      protected Z approximate(final int precision) {
        final Sequence s = new A030190().skip(m);
        Z sum = Z.ZERO;
        final Z one = CR.ONE.getApprox(precision);
        long m = 1;
        while (true) {
          final Z v = s.next();
          if (!v.isZero()) {
            final Z t = one.multiply(v).shiftRight(m);
            if (t.isZero()) {
              return sum;
            }
            sum = sum.add(t);
          }
          ++m;
        }
      }
    };
  }

  /** Construct the sequence. */
  public A389576() {
    super(A389576::champerknowneBase2ShiftedFrac);
  }
}

