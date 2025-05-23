package irvine.oeis.a383;
// Generated by gen_seq4.pl 2025-04-28.ack/holos at 2025-04-28 23:36

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A383314 Expansion of e.g.f. exp(-x/2) / (1-4*x)^(1/8).
 * @author Georg Fischer
 */
public class A383314 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A383314() {
    super(0, "[[0],[2],[-4, 4],[0,-1]]", "1", 0, 1);
  }
}
