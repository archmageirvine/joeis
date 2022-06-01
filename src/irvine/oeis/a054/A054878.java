package irvine.oeis.a054;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A054878 Number of closed walks of length n along the edges of a tetrahedron based at a vertex.
 * @author Sean A. Irvine
 */
public class A054878 extends LinearRecurrence {

  /** Construct the sequence. */
  public A054878() {
    super(new long[] {3, 2}, new long[] {1, 0});
  }
}
