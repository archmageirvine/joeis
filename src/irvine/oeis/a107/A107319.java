package irvine.oeis.a107;
// Generated by gen_seq4.pl holos at 2021-07-06 21:47

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A107319 a(n) = C(n+8,8) * C(n+6,6).
 * binomial(n+8, 8)*binomial(n+6, 6)
 * @author Georg Fischer
 */
public class A107319 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A107319() {
    super(0, "[[0],[-48,-14,-1],[0, 0, 1]]", "[1]", 0);
  }
}
