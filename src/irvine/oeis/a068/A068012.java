package irvine.oeis.a068;
// Generated by gen_seq4.pl holos at 2021-05-21 22:29
// DO NOT EDIT here!

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A068012 Number of subsets of {1,2,3,...,n} that sum to 0 mod 6.
 * @author Georg Fischer
 */
public class A068012 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A068012() {
    super(0, "[0,-4, 2, 0, 2,-1]", "[1, 1, 1, 2, 3, 6, 12]", 0);
  }
}
