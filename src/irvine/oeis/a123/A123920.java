package irvine.oeis.a123;
// Generated by gen_seq4.pl holos [0,1,-1,0,0,0,0,-1,1] [1,2,1,2,2,2,3] 0 at 2019-12-17 15:30
// DO NOT EDIT here!

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A123920 Number of numbers congruent to 2 or 4 mod 6 between n and 2n inclusive.
 * @author Georg Fischer
 */
public class A123920 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A123920() {
    super(1, "[0,1,-1,0,0,0,0,-1,1]", "[1,2,1,2,2,2,3]", 0);
  }
}
