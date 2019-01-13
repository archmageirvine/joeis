package irvine.oeis.a101;

import irvine.oeis.LinearRecurrence;

/**
 * A101498.
 * @author Sean A. Irvine
 */
public class A101498 extends LinearRecurrence {

  /** Construct the sequence. */
  public A101498() {
    super(new long[] {-1, -3, -1, 3}, new long[] {1, 3, 7, 15});
  }
}
