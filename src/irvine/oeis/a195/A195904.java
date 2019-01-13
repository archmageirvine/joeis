package irvine.oeis.a195;

import irvine.oeis.LinearRecurrence;

/**
 * A195904.
 * @author Sean A. Irvine
 */
public class A195904 extends LinearRecurrence {

  /** Construct the sequence. */
  public A195904() {
    super(new long[] {-2, 1, 0, 0, 0, 0, 2}, new long[] {1, 2, 4, 8, 16, 32, 65});
  }
}
