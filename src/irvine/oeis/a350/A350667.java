package irvine.oeis.a350;
// Generated by gen_seq4.pl holsig/holos at 2022-09-29 21:58

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A350667 Numbers congruent to 1, 3, and 8 modulo 9: positions of 1 in A159955.
 * @author Georg Fischer
 */
public class A350667 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A350667() {
    super(0, "[0,-1,1,0,1,-1]", "1,3,8,10,12", 0);
  }
}
