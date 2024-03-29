package irvine.oeis.a118;
// Generated by gen_seq4.pl holos [0,-1,0,0,0,0,0,1] [2,5,8,11,14,44,47,77,80] 0 at 2019-12-17 15:30
// DO NOT EDIT here!

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A118518 Define sequence S_m by: initial term = m, reverse digits and add 3 to get next term. Entry shows S_2. This reaches a cycle of length 6 in 3 steps.
 * @author Georg Fischer
 */
public class A118518 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A118518() {
    super(1, "[0,-1,0,0,0,0,0,1]", "[2,5,8,11,14,44,47,77,80]", 0);
  }
}
