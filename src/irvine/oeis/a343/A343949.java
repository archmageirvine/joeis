package irvine.oeis.a343;
// Generated by gen_seq4.pl holos at 2021-06-02 19:27
// DO NOT EDIT here!

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A343949 Shortest distance from curve start to end along the segments of dragon curve expansion level n, and which is the diameter of the curve as a graph.
 * Lin.rec. signature: (1, 3,-3,-2, 2)
 * @author Georg Fischer
 */
public class A343949 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A343949() {
    super(0, "[0, 2,-2,-3, 3, 1,-1]", "1, 2, 4, 8, 12, 18, 26, 36, 52, 70, 102", 0);
  }
}
