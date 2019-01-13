package irvine.oeis.a070;

import irvine.oeis.LinearRecurrence;

/**
 * A070371.
 * @author Sean A. Irvine
 */
public class A070371 extends LinearRecurrence {

  /** Construct the sequence. */
  public A070371() {
    super(new long[] {1, -1, 0, 0, 0, 0, 0, 0, 1}, new long[] {1, 5, 8, 6, 13, 14, 2, 10, 16});
  }
}
