package irvine.oeis.a113;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A113438 Third row of A113435.
 * @author Sean A. Irvine
 */
public class A113438 extends LinearRecurrence {

  /** Construct the sequence. */
  public A113438() {
    super(new long[] {-1, 11, -15, 7}, new long[] {1, 4, 16, 62});
  }
}
