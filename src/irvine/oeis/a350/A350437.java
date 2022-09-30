package irvine.oeis.a350;
// manually holsig/holos at 2022-09-30 08:07

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A350437 a(n) is the number of integers that can be represented in a 7-segment display by using only n segments (version A006942).
 * @author Georg Fischer
 */
public class A350437 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A350437() {
    super(0, "[0,1,3,3,1,1,1,0,-1]", "0,0,1,2,3,7,12,18,31,52,92,158,269,460", 0);
  }
}
