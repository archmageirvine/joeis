package irvine.oeis.a269;

import irvine.oeis.LinearRecurrence;

/**
 * A269965.
 * @author Sean A. Irvine
 */
public class A269965 extends LinearRecurrence {

  /** Construct the sequence. */
  public A269965() {
    super(new long[] {-2, 0, 4, -3, -1, 3}, new long[] {1, 3, 10, 26, 63, 145});
  }
}
