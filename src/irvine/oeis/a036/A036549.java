package irvine.oeis.a036;

import irvine.oeis.LinearRecurrence;

/**
 * A036549.
 * @author Sean A. Irvine
 */
public class A036549 extends LinearRecurrence {

  /** Construct the sequence. */
  public A036549() {
    super(new long[] {-3, 4}, new long[] {1, 257});
  }
}
