package irvine.oeis.a227;

import irvine.oeis.LinearRecurrence;

/**
 * A227200.
 * @author Sean A. Irvine
 */
public class A227200 extends LinearRecurrence {

  /** Construct the sequence. */
  public A227200() {
    super(new long[] {-2, -1, 3}, new long[] {0, 1, 0});
  }
}
