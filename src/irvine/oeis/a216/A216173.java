package irvine.oeis.a216;

import irvine.oeis.LinearRecurrence;

/**
 * A216173 Number of all possible tetrahedra of <code>any</code> size and orientation, formed when intersecting the original regular tetrahedron by planes parallel to its sides and dividing its edges into n equal parts.
 * @author Sean A. Irvine
 */
public class A216173 extends LinearRecurrence {

  /** Construct the sequence. */
  public A216173() {
    super(new long[] {1, -4, 6, -5, 5, -6, 4}, new long[] {1, 5, 16, 39, 80, 147, 249});
  }
}
