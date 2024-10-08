package irvine.oeis.a374;
// Generated by gen_seq4.pl 2024-08-09.ack/holos at 2024-08-10 19:00

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A374882 Expansion of e.g.f. exp( (1 - (1 - 9*x)^(1/3))/3 ).
 * @author Georg Fischer
 */
public class A374882 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A374882() {
    super(0, "[[0], [1], [-504, 405, -81], [-36, 18], [-1]]", "1, 1, 7", 0, 0);
  }
}
