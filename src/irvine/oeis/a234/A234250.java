package irvine.oeis.a234;

import irvine.oeis.LinearRecurrence;

/**
 * A234250 Number of ways to choose 3 points in an <code>n X n X n</code> triangular grid so that they do not form a <code>2 X 2 X 2</code> triangle.
 * @author Sean A. Irvine
 */
public class A234250 extends LinearRecurrence {

  /** Construct the sequence. */
  public A234250() {
    super(new long[] {1, -7, 21, -35, 35, -21, 7}, new long[] {0, 16, 111, 439, 1305, 3240, 7091});
  }
}
