package irvine.oeis.a347;
// manually holsig/holos at 2022-09-29 22:19

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A347677 Number of Baxter matrices of size 3 X n that contain n+2 1&apos;s.
 * @author Georg Fischer
 */
public class A347677 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A347677() {
    super(1, "[0,1,-3,3,-1]", "1,8,26,55,96", 0);
  }
}
