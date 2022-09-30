package irvine.oeis.a350;
// manually holsig/holos at 2022-09-30 08:07

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A350362 2-tone chromatic number of an n-cycle.
 * @author Georg Fischer
 */
public class A350362 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A350362() {
    super(3, "[0,1,-1]", "6,6,5,5,6,5", 0);
  }
}
