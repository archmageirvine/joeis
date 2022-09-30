package irvine.oeis.a347;
// manually holsig/holos at 2022-09-29 22:19

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A347861 a(n) = A000032(n)*A000032(n+1) mod A000032(n+2).
 * @author Georg Fischer
 */
public class A347861 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A347861() {
    super(0, "[0,-1,-1,3,3,-1,-1]", "2,3,5,6,5,24,5", 0);
  }
}
