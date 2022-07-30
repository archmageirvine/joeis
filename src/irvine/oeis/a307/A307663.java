package irvine.oeis.a307;
// manually dfinite/holos at 2022-07-30 10:17

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A307663 a(n) = (n-1)!*(Sum_{i=1..n} Sum_{j=1..i} binomial(i,j)*i/j).
 * Recurrence 2*(n+3)*(n+2)*n*(n-2)*a(n) - (n+3)*(5*n^2-6*n-17)*a(n+1) + (4 n^2-n-29)* a(n+2) -(n-3)*a(n+3) = 0.
 * @author Georg Fischer
 */
public class A307663 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A307663() {
    super(1, "[[0],[0,-30, 46,-18, 2],[0,-46, 36,-5],[10,-25, 4],[6,-1]]", "1, 6, 41, 329, 3090, 33654", 0);
  }
}
