package irvine.oeis.a144;

import irvine.oeis.LinearRecurrence;

/**
 * A144391.
 * @author Sean A. Irvine
 */
public class A144391 extends LinearRecurrence {

  /** Construct the sequence. */
  public A144391() {
    super(new long[] {1, -3, 3}, new long[] {3, 13, 29});
  }
}
