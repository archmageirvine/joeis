package irvine.oeis.a378;
// Generated by gen_seq4.pl 2025-03-07.ack/holos at 2025-03-07 21:14

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A378816 Expansion of 2*(x - 1)^3/(3*x^3 - 5*x^2 + x + 1 + sqrt(-(x - 1)^3*(x + 1)^2*(3*x + 1))).
 * @author Georg Fischer
 */
public class A378816 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A378816() {
    super(0, "[[0],[18,-15,3],[8,6,-5],[4,7,1],[0,2,1]]", "-1", 0, 0);
  }
}
