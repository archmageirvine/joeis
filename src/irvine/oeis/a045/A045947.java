package irvine.oeis.a045;

import irvine.oeis.LinearRecurrence;

/**
 * A045947 Triangles in open triangular matchstick arrangement (triangle minus one side) of side n.
 * @author Sean A. Irvine
 */
public class A045947 extends LinearRecurrence {

  /** Construct the sequence. */
  public A045947() {
    super(new long[] {-1, 3, -2, -2, 3}, new long[] {0, 0, 2, 7, 17});
  }
}
