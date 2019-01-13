package irvine.oeis.a290;

import irvine.oeis.LinearRecurrence;

/**
 * A290056.
 * @author Sean A. Irvine
 */
public class A290056 extends LinearRecurrence {

  /** Construct the sequence. */
  public A290056() {
    super(new long[] {-4, 20, -41, 44, -26, 8}, new long[] {1, 2, 8, 27, 76, 192});
  }
}
