package irvine.oeis.a287;

import irvine.oeis.LinearRecurrence;

/**
 * A287275.
 * @author Sean A. Irvine
 */
public class A287275 extends LinearRecurrence {

  /** Construct the sequence. */
  public A287275() {
    super(new long[] {1, -2, -2, 4}, new long[] {1, 1, 2, 5});
  }
}
