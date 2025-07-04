package irvine.oeis.a378;
// Generated by gen_seq4.pl 2025-06-01.ack/holos at 2025-06-01 21:15

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A378943 Numbers obtained from the tribonacci triangle formed by the number of connection points in the paths obtained by Pell walk on the square grid.
 * @author Georg Fischer
 */
public class A378943 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A378943() {
    super(1, "[0,-1,-1,0,2,1,-1]", "2,3,7,13,25", 0, 0);
  }
}
