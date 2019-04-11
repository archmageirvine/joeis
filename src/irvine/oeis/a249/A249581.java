package irvine.oeis.a249;

import irvine.oeis.LinearRecurrence;

/**
 * A249581 List of quadruples (r,s,t,u): the matrix M <code>= [[9,24,16][3,10,8][1,4,4]]</code> is raised to successive powers, then (r,s,t,u) are the square roots of M[3,1], M[3,3], M[1,1], M[1,3] respectively.
 * @author Sean A. Irvine
 */
public class A249581 extends LinearRecurrence {

  /** Construct the sequence. */
  public A249581() {
    super(new long[] {-2, 0, 0, 0, 5, 0, 0, 0}, new long[] {0, 1, 1, 0, 1, 2, 3, 4});
  }
}
