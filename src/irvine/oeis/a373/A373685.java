package irvine.oeis.a373;
// Generated by gen_seq4.pl 2024-06-15/holos at 2024-06-16 00:06

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A373685 Expansion of e.g.f. exp(x / (1 - x^3)^2) / (1 - x^3).
 * exp(x / (1 - x^3)^2) / (1 - x^3)
 * @author Georg Fischer
 */
public class A373685 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A373685() {
    super(0, "[[0], [-6, 1], [0], [0], [12, -3], [0], [5], [-6, 3], [0], [1], [0, -1]]", "1", 0, 1);
  }
}
