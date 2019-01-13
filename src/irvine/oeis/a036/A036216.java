package irvine.oeis.a036;

import irvine.oeis.LinearRecurrence;

/**
 * A036216.
 * @author Sean A. Irvine
 */
public class A036216 extends LinearRecurrence {

  /** Construct the sequence. */
  public A036216() {
    super(new long[] {-81, 108, -54, 12}, new long[] {1, 12, 90, 540});
  }
}
