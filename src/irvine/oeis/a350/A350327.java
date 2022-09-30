package irvine.oeis.a350;
// manually holsig/holos at 2022-09-30 08:07

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A350327 Maximum domination number of connected graphs with n vertices and minimum degree 2.
 * @author Georg Fischer
 */
public class A350327 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A350327() {
    super(3, "[0,-1,1,0,0,0,1,-1]", "1,2,2,2,3,3,3,4,4,4,5", 0);
  }
}
