package irvine.oeis.a121;

import irvine.oeis.LinearRecurrence;

/**
 * A121254.
 * @author Sean A. Irvine
 */
public class A121254 extends LinearRecurrence {

  /** Construct the sequence. */
  public A121254() {
    super(new long[] {-1, 6, -11, 6}, new long[] {4, 16, 60, 208});
  }
}
