package irvine.oeis.a375;
// Generated by gen_seq4.pl 2024-10-08.ack/holos at 2024-10-08 23:52

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A375021 Expansion of 1/sqrt(1 - 2*x + 3*x^2 + 2*x^3 + x^4).
 * Expansion of 1/sqrt(1 - 2*x + 3*x^2 + 2*x^3 + x^4).
 * @author Georg Fischer
 */
public class A375021 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A375021() {
    super(0, "[[0],[-2,1],[-3,2],[-3,3],[1,-2],[0,1]]", "1", 0, 0);
  }
}
