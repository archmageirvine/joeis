package irvine.oeis.a107;

import irvine.oeis.LinearRecurrence;

/**
 * A107585.
 * @author Sean A. Irvine
 */
public class A107585 extends LinearRecurrence {

  /** Construct the sequence. */
  public A107585() {
    super(new long[] {5, -11, 7}, new long[] {1, 0, 15});
  }
}
