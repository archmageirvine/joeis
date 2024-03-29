package irvine.oeis.a361;
// Generated by gen_seq4.pl binomin/holos at 2023-05-08 14:44

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A361040 a(n) = 420*(3*n)!/(n!*(2*n + 3)!).
 * @author Georg Fischer
 */
public class A361040 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A361040() {
    super(0, "[[0],[-6,27,-27],[6,10,4]]", "[70,21]", 0);
  }
}
