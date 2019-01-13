package irvine.oeis.a287;

import irvine.oeis.LinearRecurrence;

/**
 * A287128.
 * @author Sean A. Irvine
 */
public class A287128 extends LinearRecurrence {

  /** Construct the sequence. */
  public A287128() {
    super(new long[] {2, -4, 2, -2, 3}, new long[] {2, 3, 6, 13, 29});
  }
}
