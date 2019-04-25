package irvine.oeis.a270;

import irvine.oeis.LinearRecurrence;

/**
 * A270205 Number of 2 X 2 planar subsets in an <code>n</code> X n X n cube.
 * @author Sean A. Irvine
 */
public class A270205 extends LinearRecurrence {

  /** Construct the sequence. */
  public A270205() {
    super(new long[] {-1, 4, -6, 4}, new long[] {0, 0, 6, 36});
  }
}
