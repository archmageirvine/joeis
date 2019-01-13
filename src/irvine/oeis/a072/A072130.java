package irvine.oeis.a072;

import irvine.oeis.LinearRecurrence;

/**
 * A072130.
 * @author Sean A. Irvine
 */
public class A072130 extends LinearRecurrence {

  /** Construct the sequence. */
  public A072130() {
    super(new long[] {1, -3, 1, -1, 3}, new long[] {0, 1, 5, 14, 37});
  }
}
