package irvine.oeis.a375;
// Generated by gen_seq4.pl 2024-08-16.ack/holos at 2024-08-16 19:15

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A375427 Expansion of e.g.f. exp(-x * (1 - x)^2) / (1 - x)^3.
 * exp(-x*(1-x)^2)/(1-x)^3
 * @author Georg Fischer
 */
public class A375427 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A375427() {
    super(0, "[[0], [3], [-7], [5], [1, 1], [0, -1]]", "1, 2, 11, 50, 349, 2314", 0, 1);
  }
}
