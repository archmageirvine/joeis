package irvine.oeis.a144;

import irvine.oeis.LinearRecurrence;

/**
 * A144941.
 * @author Sean A. Irvine
 */
public class A144941 extends LinearRecurrence {

  /** Construct the sequence. */
  public A144941() {
    super(new long[] {1, -1, -1154, 1154, 1}, new long[] {1, 36, 753, 41348, 868769});
  }
}
