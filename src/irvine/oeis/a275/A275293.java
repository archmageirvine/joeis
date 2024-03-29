package irvine.oeis.a275;
// Generated by gen_seq4.pl 2023-12-02/holos at 2023-12-03 21:34

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A275293 Number of set partitions of [2n] with symmetric block size list of length four.
 * @author Georg Fischer
 */
public class A275293 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A275293() {
    super(2, "[[0],[1440,-8976, 23560,-33300, 27208,-12828, 3232,-336],[-4320, 27648,-75072, 110446,-94435, 46805,-12437, 1365],[0, 0, 528,-2188, 3170,-2132, 682,-84]]", "1, 13", 0);
  }
}
