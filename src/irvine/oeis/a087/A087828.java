package irvine.oeis.a087;
// manually 2026-07-15/hofstadt at 2026-07-15 13:57

import irvine.oeis.recur.HofstadterSequence;

/**
 * A087828 a(n) = a(Min(n-1,Abs(n - a(n-1)))) + a(a(Abs(n - a(n-3)))).
 * @author Georg Fischer
 */
public class A087828 extends HofstadterSequence {

  /** Construct the sequence. */
  public A087828() {
    super(0, 1, 1, 1, 1);
    super.next();
  }

  protected int compute(final int n) {
    return a(Math.min(n - 1, Math.abs(n - a(n - 1)))) + a(a(Math.abs(n - a(n - 3))));
  }
}
