package irvine.oeis.a101;

import irvine.oeis.LinearRecurrence;

/**
 * A101368.
 * @author Sean A. Irvine
 */
public class A101368 extends LinearRecurrence {

  /** Construct the sequence. */
  public A101368() {
    super(new long[] {1, -6, 6}, new long[] {1, 1, 3});
  }
}
