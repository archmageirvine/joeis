package irvine.oeis.a191;

import irvine.oeis.LinearRecurrence;

/**
 * A191489 Number of compositions of even natural numbers into 6 parts <code>&lt;=</code> n.
 * @author Sean A. Irvine
 */
public class A191489 extends LinearRecurrence {

  /** Construct the sequence. */
  public A191489() {
    super(new long[] {1, -6, 14, -14, 0, 14, -14, 6}, new long[] {1, 32, 365, 2048, 7813, 23328, 58825, 131072});
  }
}
