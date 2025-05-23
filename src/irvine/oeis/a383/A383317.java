package irvine.oeis.a383;
// Generated by gen_seq4.pl 2025-04-28.ack/holos at 2025-04-28 23:36

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A383317 Expansion of e.g.f. exp(x/2) / (1-6*x)^(1/12).
 * @author Georg Fischer
 */
public class A383317 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A383317() {
    super(0, "[[0],[-3],[-5, 6],[0,-1]]", "1", 0, 1);
  }
}
