package irvine.oeis.a121;

import irvine.oeis.LinearRecurrence;

/**
 * A121470.
 * @author Sean A. Irvine
 */
public class A121470 extends LinearRecurrence {

  /** Construct the sequence. */
  public A121470() {
    super(new long[] {1, -2, 0, 2}, new long[] {1, 7, 16, 31});
  }
}
