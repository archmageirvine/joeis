package irvine.oeis.a381;
// Generated by gen_seq4.pl 2025-04-30.ack/holos at 2025-04-30 23:37

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A381505 Expansion of e.g.f. exp(2*x/3) / (1-3*x)^(1/9).
 * Expansion of e.g.f.exp(2*x/3) / (1-3*x)^(1/9).
 * @author Georg Fischer
 */
public class A381505 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A381505() {
    super(0, "[[0],[-2],[-2, 3],[0,-1]]", "1", 0, 1);
  }
}
