package irvine.oeis.a117;

import irvine.oeis.LinearRecurrence;

/**
 * A117188.
 * @author Sean A. Irvine
 */
public class A117188 extends LinearRecurrence {

  /** Construct the sequence. */
  public A117188() {
    super(new long[] {-1, 0, -1, 0}, new long[] {1, 0, -2, 0});
  }
}
