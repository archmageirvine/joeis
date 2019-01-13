package irvine.oeis.a128;

import irvine.oeis.LinearRecurrence;

/**
 * A128422.
 * @author Sean A. Irvine
 */
public class A128422 extends LinearRecurrence {

  /** Construct the sequence. */
  public A128422() {
    super(new long[] {1, -2, 1, -1, 2}, new long[] {0, 0, 0, 2, 4});
  }
}
