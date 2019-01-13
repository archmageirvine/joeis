package irvine.oeis.a165;

import irvine.oeis.LinearRecurrence;

/**
 * A165568.
 * @author Sean A. Irvine
 */
public class A165568 extends LinearRecurrence {

  /** Construct the sequence. */
  public A165568() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {-1, 1, 31, 137, 391});
  }
}
