package irvine.oeis.a287;

import irvine.oeis.LinearRecurrence;

/**
 * A287143.
 * @author Sean A. Irvine
 */
public class A287143 extends LinearRecurrence {

  /** Construct the sequence. */
  public A287143() {
    super(new long[] {1, -1, -4, 4, 6, -6, -4, 4, 1}, new long[] {0, 1, 4, 9, 21, 35, 65, 95, 155});
  }
}
