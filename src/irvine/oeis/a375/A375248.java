package irvine.oeis.a375;
// Generated by gen_seq4.pl 2024-08-16.ack/holos at 2024-08-16 19:15

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A375248 Expansion of (1 - x)/(1 - 2*x - 3*x^2)^(7/2).
 * (1-x)/(-3*x^2-2*x+1)^(7/2)
 * @author Georg Fischer
 */
public class A375248 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A375248() {
    super(0, "[[0], [9, 3], [-14, -1], [-3, -3], [0, 1]]", "1, 6, 35, 168, 756", 0, 0);
  }
}
