package irvine.oeis.a364;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A364401 a(n) is the number of regions into which three-dimensional Euclidean space is divided by n planes parallel to each face of a regular tetrahedron with edge length n, dividing the edges into unit segments.
 * @author Sean A. Irvine
 */
public class A364401 extends LinearRecurrence {

  /** Construct the sequence. */
  public A364401() {
    super(1, new long[] {-1, 4, -6, 4}, new long[] {1, 15, 65, 174});
  }
}
