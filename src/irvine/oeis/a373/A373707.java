package irvine.oeis.a373;
// Generated by gen_seq4.pl 2024-08-02.ack/holos at 2024-08-02 23:54

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A373707 Expansion of e.g.f. exp(x * (1 + x^3)^2).
 * 0
 * @author Georg Fischer
 */
public class A373707 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A373707() {
    super(0, "[[0], [-7], [0], [0], [-8], [0], [0], [-1], [0, 1]]", "1, 1, 1, 1, 49, 241, 721, 6721, 124321", 0, 1);
  }
}
