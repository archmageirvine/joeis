package irvine.oeis.a355;
// manually holsig/holos at 2022-09-30 08:07

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A355399 a(n) is the failed skew zero forcing number of C^2_n.
 * @author Georg Fischer
 */
public class A355399 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A355399() {
    super(3, "[0,-1,1,0,1,-1]", "0,1,2,4,3,4,6,5,6,8,6,8", 0);
  }
}
