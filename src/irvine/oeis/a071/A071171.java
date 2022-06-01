package irvine.oeis.a071;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A071171 L_2 norm of vertices of Permuto-Associahedron in R^n.
 * @author Sean A. Irvine
 */
public class A071171 extends LinearRecurrence {

  /** Construct the sequence. */
  public A071171() {
    super(new long[] {-1, 8, -28, 56, -70, 56, -28, 8}, new long[] {0, 0, 5, 122, 1022, 5122, 18847, 56332});
  }
}
