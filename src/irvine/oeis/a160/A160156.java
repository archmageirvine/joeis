package irvine.oeis.a160;

import irvine.oeis.LinearRecurrence;

/**
 * A160156.
 * @author Sean A. Irvine
 */
public class A160156 extends LinearRecurrence {

  /** Construct the sequence. */
  public A160156() {
    super(new long[] {4, -9, 6}, new long[] {1, 4, 15});
  }
}
