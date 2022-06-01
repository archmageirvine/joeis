package irvine.oeis.a249;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A249580 List of quadruples (r,s,t,u): the matrix M = [[4,12,9][2,5,3][1,2,1]] is raised to successive negative powers, then (r,s,t,u) are the square roots of M[1,3], M[1,1], M[3,3], M[3,1] respectively.
 * @author Sean A. Irvine
 */
public class A249580 extends LinearRecurrence {

  /** Construct the sequence. */
  public A249580() {
    super(new long[] {1, 0, 0, 0, -3, 0, 0, 0}, new long[] {3, -1, -2, 1, -9, 4, 7, -3});
  }
}
