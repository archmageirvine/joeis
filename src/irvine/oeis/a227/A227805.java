package irvine.oeis.a227;

import irvine.oeis.LinearRecurrence;

/**
 * A227805 Sum of even numbers starting at 2, alternating signs.
 * @author Sean A. Irvine
 */
public class A227805 extends LinearRecurrence {

  /** Construct the sequence. */
  public A227805() {
    super(new long[] {1, 1, -1}, new long[] {2, 6, 0});
  }
}
