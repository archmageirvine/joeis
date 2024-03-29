package irvine.oeis.a361;
// Generated by gen_seq4.pl binomin/holos at 2023-05-08 14:44

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A361041 a(n) = 1680*(3*n)!/(n!*(2*n + 4)!).
 * @author Georg Fischer
 */
public class A361041 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A361041() {
    super(0, "[[0],[-6,27,-27],[12,14,4]]", "[70,14]", 0);
  }
}
