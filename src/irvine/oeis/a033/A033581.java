package irvine.oeis.a033;

import irvine.oeis.LinearRecurrence;

/**
 * A033581.
 * @author Sean A. Irvine
 */
public class A033581 extends LinearRecurrence {

  /** Construct the sequence. */
  public A033581() {
    super(new long[] {1, -3, 3}, new long[] {0, 6, 24});
  }
}
