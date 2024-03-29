package irvine.oeis.a368;
// Generated by gen_seq4.pl holfsig/holos at 2024-02-04 22:45

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A368475 Expansion of o.g.f. (1-x)^5/((1-x)^5 - x^4).
 * @author Georg Fischer
 */
public class A368475 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A368475() {
    super(0, "[0, 1, -4, 10, -10, 5, -1]", "1, 0, 0, 0, 1, 5, 15, 35, 71, 136, 265", 0);
  }
}
