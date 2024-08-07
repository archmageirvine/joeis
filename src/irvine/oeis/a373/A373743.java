package irvine.oeis.a373;
// Generated by gen_seq4.pl 2024-08-02.ack/holos at 2024-08-02 23:54

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A373743 Expansion of e.g.f. exp(x^3/6 * (1 + x)^2).
 * 0
 * @author Georg Fischer
 */
public class A373743 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A373743() {
    super(0, "[[0], [-5], [-8], [-3], [0], [0], [0, 6]]", "1, 0, 0, 1, 8, 20, 10", 0, 1);
  }
}
