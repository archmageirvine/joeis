package irvine.oeis.a216;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A216172 Number of all possible tetrahedra of any size, having reverse orientation to the original regular tetrahedron, formed when intersecting the latter by planes parallel to its sides and dividing its edges into n equal parts.
 * @author Sean A. Irvine
 */
public class A216172 extends LinearRecurrence {

  /** Construct the sequence. */
  public A216172() {
    super(1, new long[] {1, -4, 6, -5, 5, -6, 4}, new long[] {0, 0, 1, 4, 10, 21, 39});
  }
}
