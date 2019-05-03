package irvine.oeis.a270;

import irvine.oeis.LinearRecurrence;

/**
 * A270205 Number of <code>2 X 2</code> planar subsets in an <code>n X n X n</code> cube.
 * @author Sean A. Irvine
 */
public class A270205 extends LinearRecurrence {

  /** Construct the sequence. */
  public A270205() {
    super(new long[] {-1, 4, -6, 4}, new long[] {0, 0, 6, 36});
  }
}
