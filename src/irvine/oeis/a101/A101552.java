package irvine.oeis.a101;

import irvine.oeis.LinearRecurrence;

/**
 * A101552.
 * @author Sean A. Irvine
 */
public class A101552 extends LinearRecurrence {

  /** Construct the sequence. */
  public A101552() {
    super(new long[] {1, 0, 0, 0, -1, 4, -6, 4}, new long[] {0, 0, 0, 0, 0, 0, 1, 4});
  }
}
