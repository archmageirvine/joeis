package irvine.oeis.a137;

import irvine.oeis.LinearRecurrence;

/**
 * A137932.
 * @author Sean A. Irvine
 */
public class A137932 extends LinearRecurrence {

  /** Construct the sequence. */
  public A137932() {
    super(new long[] {1, -2, 0, 2}, new long[] {0, 0, 0, 4});
  }
}
