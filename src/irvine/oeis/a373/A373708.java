package irvine.oeis.a373;
// Generated by gen_seq4.pl 2024-08-02.ack/holos at 2024-08-02 23:54

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A373708 Expansion of e.g.f. exp(x * (1 + x^4)^2).
 * 0
 * @author Georg Fischer
 */
public class A373708 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A373708() {
    super(0, "[[0], [-9], [0], [0], [0], [-10], [0], [0], [0], [-1], [0, 1]]", "1, 1, 1, 1, 1, 241, 1441, 5041, 13441, 393121, 10946881", 0, 1);
  }
}
