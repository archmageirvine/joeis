package irvine.oeis.a026;

import irvine.oeis.LinearRecurrence;

/**
 * A026056.
 * @author Sean A. Irvine
 */
public class A026056 extends LinearRecurrence {

  /** Construct the sequence. */
  public A026056() {
    super(new long[] {-1, 3, -3, 1, 0, 1, -3, 3}, new long[] {2, 5, 10, 16, 23, 33, 45, 60});
  }
}
