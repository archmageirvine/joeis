package irvine.oeis.a337;
// Generated by gen_seq4.pl holos at 2020-10-26 23:20
// 6: 7
// DO NOT EDIT here!

import irvine.oeis.recur.HolonomicRecurrence;


/**
 * A337483 Number of ordered triples of positive integers summing to n that are either weakly increasing or weakly decreasing.
 * @author Georg Fischer
 */
public class A337483 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A337483() {
    super(0, "[[0],[1],[-1],[-1],[0],[1],[1],[-1]]", "[0, 0, 0, 1, 2, 4, 5]", 0);
  }
}
