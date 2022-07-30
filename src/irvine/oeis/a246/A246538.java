package irvine.oeis.a246;
// manually dfinite/holos at 2022-07-30 11:44

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A246538 G.f.: Sum_{n&gt;=0} 2^n * x^n / (1-x)^(2*n+1) * [Sum_{k=0..n} C(n,k)^2 * x^k]^2.
 * Recurrence: (n-4)*(n-1)^2*a(n) = 3*(n-4)*(3*n^2 - 9*n + 7)*a(n-1) - (n-2)*(n^2 - 6*n + 6)*a(n-2) - 3*(n-3)*(11*n^2 - 66*n + 92)*a(n-3) - 2*(n-4)*(n^2 - 6*n + 6)*a(n-4) + 12*(n-2)*(3*n^2 - 27*n + 61)*a(n-5) - 8*(n-5)^2*(n-2)*a(n-6).
 * @author Georg Fischer
 */
public class A246538 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A246538() {
    super(0, "[[0],[400,-360, 96,-8],[-1464, 1380,-396, 36],[48,-60, 20,-2],[828,-870, 297,-33],[12,-18, 8,-1],[-84, 129,-63, 9],[4,-9, 6,-1]]",
      "1, 3, 15, 87", -1);
  }
}
