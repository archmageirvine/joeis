package irvine.oeis.a355;
// manually holsig/holos at 2022-09-30 08:07

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A355067 a(n) is the failed skew zero forcing number of P^3_n.
 * @author Georg Fischer
 */
public class A355067 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A355067() {
    super(3, "[0,-1,1,0,0,1,-1]", "0,1,3,3,4,4,6,5,6,7", 0);
  }
}
