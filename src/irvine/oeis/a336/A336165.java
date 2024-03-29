package irvine.oeis.a336;
// Generated by gen_seq4.pl holos at 2021-05-20 21:38
// DO NOT EDIT here!

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A336165 G.f. A(x) satisfies: A(x) = 1 + x * ((1 - x) * A(x))^2.
 * @author Georg Fischer
 */
public class A336165 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A336165() {
    super(0, "[[0],[84,-66, 12],[-204, 184,-40],[156,-172, 48],[-30, 59,-27],[0,-6, 8],[0,-1,-1]]", "[1, 1, 0,-2,-4]", 0);
  }
}
