package irvine.oeis.a227;

import irvine.oeis.LinearRecurrence;

/**
 * A227316.
 * @author Sean A. Irvine
 */
public class A227316 extends LinearRecurrence {

  /** Construct the sequence. */
  public A227316() {
    super(new long[] {1, -3, 6, -10, 12, -12, 10, -6, 3}, new long[] {0, 2, 3, 6, 20, 30, 21, 28, 72});
  }
}
