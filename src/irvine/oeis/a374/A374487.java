package irvine.oeis.a374;
// Generated by gen_seq4.pl 2024-07-11/holos at 2024-07-11 18:00

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A374487 Expansion of 1/(1 - 2*x - 7*x^2)^(3/2).
 * (2*n+3)*a(n)+(7*n+14)*a(n-1)+(-n-1)*a(n+1) = 0
 * @author Georg Fischer
 */
public class A374487 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A374487() {
    super(0, "[[0], [7, 7], [1, 2], [0, -1]]", "1", 0, 0);
  }
}
