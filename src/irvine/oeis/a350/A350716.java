package irvine.oeis.a350;
// manually holsig/holos at 2022-09-30 08:07

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A350716 a(n) is the minimum number of vertices of degree 3 over all 3-collapsible graphs with n vertices.
 * @author Georg Fischer
 */
public class A350716 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A350716() {
    super(4, "[0,-1,1,0,0,0,1,-1]", "4,4,4,4,4,4,4,5,5,6", 0);
  }
}
