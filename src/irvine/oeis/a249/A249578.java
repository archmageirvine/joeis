package irvine.oeis.a249;

import irvine.oeis.LinearRecurrence;

/**
 * A249578 List of triples <code>(r,s,t)</code>: the matrix M <code>= [[4,12,9][2,7,6][1,4,4]]</code> is raised to successive powers, then <code>(r,s,t)</code> are the square roots of <code>M[3,1], M[1,1], M[1,3]</code> respectively.
 * @author Sean A. Irvine
 */
public class A249578 extends LinearRecurrence {

  /** Construct the sequence. */
  public A249578() {
    super(new long[] {-1, 0, 0, 4, 0, 0}, new long[] {0, 1, 0, 1, 2, 3});
  }
}
