package irvine.oeis.a384;
// Generated by gen_seq4.pl 2025-07-06.ack/holos at 2025-07-06 20:53

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A384153 a(n) is the number of binary strings of length n whose shortest run of 1s is of length 1.
 * @author Georg Fischer
 */
public class A384153 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A384153() {
    super(0, "[0,-2,3,-5,4,-1]", "0,1,2,4", 0, 0);
  }
}
