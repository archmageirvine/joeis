package irvine.oeis.a117;

import irvine.oeis.LinearRecurrence;

/**
 * A117199.
 * @author Sean A. Irvine
 */
public class A117199 extends LinearRecurrence {

  /** Construct the sequence. */
  public A117199() {
    super(new long[] {1, 1, 1, 0, -1, -1}, new long[] {1, 1, 2, 0, 2, 0});
  }
}
