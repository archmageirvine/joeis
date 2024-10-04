package irvine.oeis.a072;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A072444.
 * @author Sean A. Irvine
 */
public class A072449 extends DecimalExpansionSequence {

  private static CR s(final int n, final int m) {
    if (n > m) {
      return CR.ZERO;
    }
    return new CR() {
      @Override
      protected Z approximate(final int precision) {
        return CR.valueOf(new Q(s(n + 1, m).getApprox(precision), Z.ONE.shiftLeft(-precision))).add(n).sqrt().getApprox(precision);
      }
    };
  }

  private static CR s(final int n) {
    return new CR() {
      private int mLo = 5;
      private int mHi = 10;
      @Override
      protected Z approximate(final int precision) {
        while (true) {
          final Z l = s(n, mLo).getApprox(precision);
          final Z h = s(n, mHi).getApprox(precision);
          if (l.equals(h)) {
            return h;
          }
          mLo = mHi;
          mHi += 10;
        }
      }
    };
  }

  /** Construct the sequence. */
  public A072449() {
    super(1, s(1));
  }
}

