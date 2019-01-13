package irvine.oeis.a269;

import irvine.oeis.LinearRecurrence;

/**
 * A269962.
 * @author Sean A. Irvine
 */
public class A269962 extends LinearRecurrence {

  /** Construct the sequence. */
  public A269962() {
    super(new long[] {-2, 2, 2, -5, 4}, new long[] {1, 5, 17, 45, 105});
  }
}
