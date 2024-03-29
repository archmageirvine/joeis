package irvine.oeis.a337;
// Generated by gen_seq4.pl rectoproc/holos5 at 2022-08-12 18:10

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A337394 Expansion of sqrt(2 / ( (1-6*x+25*x^2) * (1-5*x+sqrt(1-6*x+25*x^2)) )).
 * sumrecursion( (-1)^(n-k) * binomial(2*k,k) * binomial(2*n+1, 2*k),k,a(n));
 * @author Georg Fischer
 */
public class A337394 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A337394() {
    super(0, "[[0],[25, 25,-250, 200],[-1,-2, 36,-48],[0,-3,-2, 8]]", "1, 5, 11,-29", 0);
  }
}
