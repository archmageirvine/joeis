package irvine.oeis.a350;
// Generated by gen_seq4.pl holsig/holos at 2022-09-29 21:58

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A350666 Numbers congruent to 0, 5, and 7 modulo 9: positions of 0 in A159955.
 * @author Georg Fischer
 */
public class A350666 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A350666() {
    super(0, "[0,-1,1,0,1,-1]", "0,5,7,9,14", 0);
  }
}
