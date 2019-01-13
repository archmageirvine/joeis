package irvine.oeis.a290;

import irvine.oeis.LinearRecurrence;

/**
 * A290915.
 * @author Sean A. Irvine
 */
public class A290915 extends LinearRecurrence {

  /** Construct the sequence. */
  public A290915() {
    super(new long[] {-1, 4, 2, 4}, new long[] {0, 8, 32, 144});
  }
}
