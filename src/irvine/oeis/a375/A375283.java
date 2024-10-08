package irvine.oeis.a375;
// Generated by gen_seq4.pl 2024-08-16.ack/holos at 2024-08-16 19:15

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A375283 Expansion of 1/((1 - x - x^4)^2 - 4*x^5).
 * 1/((-x^4-x+1)^2-4*x^5)
 * @author Georg Fischer
 */
public class A375283 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A375283() {
    super(0, "[[0], [0, 1], [0], [0], [0, -2], [0, -2], [0], [0, 1], [0, -2], [0, 1]]", "1, 2, 3, 4, 7, 16, 35, 68, 122, 220", 0, 0);
  }
}
