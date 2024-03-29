package irvine.oeis.a212;
// Generated by gen_seq4.pl 2023-11-11/holos at 2023-11-13 14:18

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A212405 Number of binary arrays of length 2*n+3 with no more than n ones in any length 2n subsequence (=50% duty cycle).
 * @author Georg Fischer
 */
public class A212405 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A212405() {
    super(1, "[[0],[-40,-24, 16],[10, 6,-8],[0, 0, 1]]", "13, 57, 236", 0);
  }
}
