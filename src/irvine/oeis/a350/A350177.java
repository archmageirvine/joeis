package irvine.oeis.a350;
// manually holsig/holos at 2022-09-30 08:07

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A350177 a(n) is the number of nonnegative integers that can be represented by lighting only n segments on a 9-segment display, used by the Russian postal service.
 * @author Georg Fischer
 */
public class A350177 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A350177() {
    super(0, "[0,1,1,2,3,2,0,0,-1]", "0,0,0,2,3,2,5,13,17,22,47,86,127,211", 0);
  }
}
