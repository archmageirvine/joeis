package irvine.oeis.a101;

import irvine.oeis.LinearRecurrence;

/**
 * A101357 Partial sums of A060354.
 * @author Sean A. Irvine
 */
public class A101357 extends LinearRecurrence {

  /** Construct the sequence. */
  public A101357() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {0, 1, 3, 9, 25});
  }
}
