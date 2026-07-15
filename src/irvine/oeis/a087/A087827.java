package irvine.oeis.a087;
// manually 2026-07-15/hofstadt at 2026-07-15 13:57

import irvine.oeis.recur.HofstadterSequence;

/**
 * A087827 a(n) = a(a(Min(n-1,Abs(n-a(n-1)))))+a(Abs(n-a(n-3))).
 * @author Georg Fischer
 */
public class A087827 extends HofstadterSequence {

  /** Construct the sequence. */
  public A087827() {
    super(0, 1, 1, 1, 1);
    super.next();
  }

  protected int compute(final int n) {
    return a(a(Math.min(n - 1, Math.abs(n - a(n - 1))))) + a(Math.abs(n - a(n - 3)));
  }
}
