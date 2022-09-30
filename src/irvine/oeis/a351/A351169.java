package irvine.oeis.a351;
// manually holsig/holos at 2022-09-30 08:07

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A351169 a(n) is the minimum number of vertices of degree 4 over all 4-collapsible graphs with n vertices.
 * @author Georg Fischer
 */
public class A351169 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A351169() {
    super(5, "[0,-1,1,0,0,0,0,0,1,-1]", "5,4,3,3,3,3,4,4,4,4,5", 0);
  }
}
