package irvine.oeis.a212;

import irvine.oeis.LinearRecurrence;

/**
 * A212579.
 * @author Sean A. Irvine
 */
public class A212579 extends LinearRecurrence {

  /** Construct the sequence. */
  public A212579() {
    super(new long[] {-1, 1, 2, -1, -2, -1, 2, 1}, new long[] {0, 1, 8, 31, 80, 171, 308, 509});
  }
}
