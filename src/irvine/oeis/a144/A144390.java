package irvine.oeis.a144;

import irvine.oeis.LinearRecurrence;

/**
 * A144390.
 * @author Sean A. Irvine
 */
public class A144390 extends LinearRecurrence {

  /** Construct the sequence. */
  public A144390() {
    super(new long[] {1, -3, 3}, new long[] {1, 9, 23});
  }
}
