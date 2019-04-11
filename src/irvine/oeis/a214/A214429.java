package irvine.oeis.a214;

import irvine.oeis.LinearRecurrence;

/**
 * A214429 Integers of the form <code>(n^2 - 49) / 120</code>.
 * @author Sean A. Irvine
 */
public class A214429 extends LinearRecurrence {

  /** Construct the sequence. */
  public A214429() {
    super(new long[] {1, -1, 0, 0, -2, 2, 0, 0, 1}, new long[] {0, 1, 2, 4, 11, 15, 18, 23, 37});
  }
}
