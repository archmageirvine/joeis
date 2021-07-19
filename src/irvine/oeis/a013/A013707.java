package irvine.oeis.a013;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A013707 Decimal expansion of Sum_{k=1..50000} (-1)^(k+1) / k.
 * @author Sean A. Irvine
 */
public class A013707 extends DecimalExpansionSequence {

  private static CR build5() {
    // It is actually quite hard to construct this number quickly with arbitrary precision.
    // Simple construction in Q is too slow.
    // Simple constriction in CR runs out of stack space and is slow.
    // This one combines adjacent entries at each step until the sum is formed, meaning
    // the "depth" of the computation is roughly lg(50000).
    CR[] t = new CR[50000];
    for (int k = 1; k <= t.length; ++k) {
      t[k - 1] = CR.valueOf((k & 1) == 1 ? new Q(1, k) : new Q(-1, k));
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

  /** Construct the sequence. */
  public A013707() {
    super(build5());
  }
}
