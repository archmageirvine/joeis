package irvine.oeis.a190;
// Generated by gen_seq4.pl 2025-07-06.ack/holos at 2025-07-06 20:53

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A190360 Number of one-sided n-step prudent walks, avoiding 4 or more consecutive east steps.
 * @author Georg Fischer
 */
public class A190360 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A190360() {
    super(0, "[0,-1,0,0,1,2,-1]", "1,3,7,17,40", 0, 0);
  }
}
