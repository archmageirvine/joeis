package irvine.oeis.a124;
// Generated by gen_seq4.pl holos at 2021-04-08 10:25
// DO NOT EDIT here!

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A124701 Number of base 8 circular n-digit numbers with adjacent digits differing by 1 or less.
 * @author Georg Fischer
 */
public class A124701 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A124701() {
    super(0, "[0, 0,-6, 3, 24,-20,-14, 21,-8, 1]", "[1, 8, 22, 50, 130, 338, 904, 2444, 6682]", 0);
  }
}
