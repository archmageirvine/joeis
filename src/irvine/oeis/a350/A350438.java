package irvine.oeis.a350;
// manually holsig/holos at 2022-09-30 08:07

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A350438 a(n) is the number of integers that can be represented in a 7-segment display by using only n segments (version A010371).
 * @author Georg Fischer
 */
public class A350438 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A350438() {
    super(0, "[0,1,3,3,2,0,1,0,-1]", "0,0,1,1,3,6,11,14,23,39,71,118,195,317", 0);
  }
}
