package irvine.oeis.a094;

import irvine.oeis.LinearRecurrence;

/**
 * A094707.
 * @author Sean A. Irvine
 */
public class A094707 extends LinearRecurrence {

  /** Construct the sequence. */
  public A094707() {
    super(new long[] {-1, 1, -1, 1, 1}, new long[] {0, 0, 1, 2, 3});
  }
}
