package irvine.oeis.a350;
// manually holsig/holos at 2022-09-30 08:07

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A350440 a(n) is the number of integers that can be represented in a 7-segment display by using only n segments (version A277116).
 * @author Georg Fischer
 */
public class A350440 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A350440() {
    super(0, "[0,1,2,4,1,1,1,0,-1]", "0,0,1,2,3,8,12,19,33,55,103,170,297,509", 0);
  }
}
