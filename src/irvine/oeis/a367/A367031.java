package irvine.oeis.a367;
// Generated by gen_seq4.pl holos at 2024-02-08 23:00

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A367031 G.f. satisfies A(x) = 1 + x*A(x)^2 - x^2*A(x)^4.
 * @author Georg Fischer
 */
public class A367031 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A367031() {
    super(0, "[[0], [15000, -23500, 12000, -2000], [-2700, 4830, -2530, 340], [84, -368, 331, 13], [0, -6, -27, -27]]", "1, 1, 1, -1, -10");
  }
}
