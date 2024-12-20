package irvine.oeis.a374;
// Generated by gen_seq4.pl 2024-10-28.ack/holos at 2024-10-28 19:20

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A374454 Expansion of o.g.f. 1/(1 - 4*x - 6*x^2 - 4*x^3 - x^4).
 * 1/(1 - 4*x - 6*x^2 - 4*x^3 - x^4).
 * @author Georg Fischer
 */
public class A374454 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A374454() {
    super(0, "[0, 1, 4, 6, 4,-1]", "1", 0, 0);
  }
}
