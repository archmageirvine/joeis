package irvine.oeis.a224;

import irvine.oeis.LinearRecurrence;

/**
 * A224419.
 * @author Sean A. Irvine
 */
public class A224419 extends LinearRecurrence {

  /** Construct the sequence. */
  public A224419() {
    super(new long[] {1, -1, 0, -1442, 1442, 0, 1}, new long[] {0, 1, 25, 216, 1849, 36481, 311904});
  }
}
