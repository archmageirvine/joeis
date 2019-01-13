package irvine.oeis.a144;

import irvine.oeis.LinearRecurrence;

/**
 * A144312.
 * @author Sean A. Irvine
 */
public class A144312 extends LinearRecurrence {

  /** Construct the sequence. */
  public A144312() {
    super(new long[] {1, -3, 3}, new long[] {0, 15, 55});
  }
}
