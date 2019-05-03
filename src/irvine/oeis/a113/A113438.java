package irvine.oeis.a113;

import irvine.oeis.LinearRecurrence;

/**
 * A113438 Third row of <code>A113435</code>.
 * @author Sean A. Irvine
 */
public class A113438 extends LinearRecurrence {

  /** Construct the sequence. */
  public A113438() {
    super(new long[] {-1, 11, -15, 7}, new long[] {1, 4, 16, 62});
  }
}
