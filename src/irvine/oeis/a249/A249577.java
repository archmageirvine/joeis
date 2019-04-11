package irvine.oeis.a249;

import irvine.oeis.LinearRecurrence;

/**
 * A249577 List of triples (r,s,t): the matrix M <code>= [[1,4,4][1,3,2][1,2,1]]</code> is raised to successive negative powers, then (r,s,t) are the square roots of M[3,1], M[1,1], M[1,3] respectively.
 * @author Sean A. Irvine
 */
public class A249577 extends LinearRecurrence {

  /** Construct the sequence. */
  public A249577() {
    super(new long[] {1, 0, 0, -2, 0, 0}, new long[] {2, -1, 1, -4, 3, -2});
  }
}
