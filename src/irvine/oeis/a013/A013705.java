package irvine.oeis.a013;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A013705 Decimal expansion of 4*Sum_{k=1..500000} (-1)^(k-1)/(2k-1).
 * @author Sean A. Irvine
 */
public class A013705 extends DecimalExpansionSequence {

  private static CR build5() {
    // It is actually quite hard to construct this number quickly with arbitrary precision.
    // Simple construction in Q is too slow.
    // Simple construction in CR runs out of stack space and is slow.
    // This one combines adjacent entries at each step until the sum is formed, meaning
    // the "depth" of the computation is roughly lg(500000).
    // Also done with lazy initialization to improve constructor speed.
    return new CR() {

      private CR mCR = null;

      private CR init() {
        CR[] t = new CR[500000];
        for (int k = 1; k <= t.length; ++k) {
          t[k - 1] = CR.valueOf((k & 1) == 1 ? new Q(4, 2L * k - 1) : new Q(-4, 2L * k - 1));
        }
        while (t.length > 1) {
          final CR[] r = new CR[(t.length + 1) / 2];
          for (int k = 0; k < r.length; ++k) {
            if (2 * k + 1 < t.length) {
              r[k] = t[2 * k].add(t[2 * k + 1]);
            } else {
              r[k] = t[2 * k];
            }
          }
          t = r;
        }
        return t[0];
      }

      @Override
      protected Z approximate(final int precision) {
        if (mCR == null) {
          mCR = init();
        }
        return mCR.getApprox(precision);
      }
    };
  }

  /** Construct the sequence. */
  public A013705() {
    super(build5());
  }
}
