package irvine.oeis.a355;
// manually holsig/holos at 2022-09-30 08:07

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A355509 Peaceable coexisting armies of knights: a(n) is the maximum number m such that m white knights and m black knights can coexist on an n X n chessboard without attacking each other.
 * @author Georg Fischer
 */
public class A355509 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A355509() {
    super(1, "[0,1,-2,0,2,-1]", "0,2,3,6,10,14,18,24,32,40", 0);
  }
}
