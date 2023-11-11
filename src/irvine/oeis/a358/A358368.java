package irvine.oeis.a358;

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A358368 a(n) = Sum_{k=0..n} C(n)^2 * binomial(n + k, k), where C(n) is the n-th Catalan number.
 * @author Georg Fischer
 */
public class A358368 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A358368() {
    // a(n) = (64*n^3 - 32*n^2 - 16*n + 8)*a(n - 1) / (n + 1)^3, for n >= 1.
    super(0, "[[0],[8,-16,-32,64],[-1,-3,-3,-1]]", "1", 0);
  }
}
