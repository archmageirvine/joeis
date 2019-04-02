package irvine.oeis.a033;

import irvine.oeis.LinearRecurrence;

/**
 * A033544 Wiener number of n-hexagonal triangle.
 * @author Sean A. Irvine
 */
public class A033544 extends LinearRecurrence {

  /** Construct the sequence. */
  public A033544() {
    super(new long[] {-1, 6, -15, 20, -15, 6}, new long[] {0, 27, 210, 822, 2328, 5433});
  }
}
