package irvine.oeis.a287;

import irvine.oeis.LinearRecurrence;

/**
 * A287594.
 * @author Sean A. Irvine
 */
public class A287594 extends LinearRecurrence {

  /** Construct the sequence. */
  public A287594() {
    super(new long[] {-4, -2, 4}, new long[] {3, 4, 12});
  }
}
