package irvine.oeis.a249;

import irvine.oeis.LinearRecurrence;

/**
 * A249579 List of quadruples (r,s,t,u): the matrix M = [[4,12,9][2,5,3][1,2,1]] is raised to successive powers, then (r,s,t,u) are the square roots of M[3,1], M[3,3], M[1,1], M[1,3] respectively.
 * @author Sean A. Irvine
 */
public class A249579 extends LinearRecurrence {

  /** Construct the sequence. */
  public A249579() {
    super(new long[] {1, 0, 0, 0, 3, 0, 0, 0}, new long[] {0, 1, 1, 0, 1, 1, 2, 3});
  }
}
