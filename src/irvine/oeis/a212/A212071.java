package irvine.oeis.a212;
// Generated by gen_seq4.pl holos at 2021-05-09 23:36
// DO NOT EDIT here!

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A212071 G.f. satisfies: A(x) = (1 + x*A(x)^3)^2.
 * @author Georg Fischer
 */
public class A212071 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A212071() {
    super(0, "[[0],[-144, 936, 3240,-32400, 69984,-46656],[0, 20, 0,-625, 0, 3125]]", "[1, 2]", 0);
  }
}
