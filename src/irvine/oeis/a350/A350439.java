package irvine.oeis.a350;
// manually holsig/holos at 2022-09-30 08:07

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A350439 a(n) is the number of integers that can be represented in a 7-segment display by using only n segments (version A063720).
 * @author Georg Fischer
 */
public class A350439 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A350439() {
    super(0, "[0,1,1,5,1,1,1,0,-1]", "0,0,1,2,3,9,12,20,35,58,116,180,329,560", 0);
  }
}
