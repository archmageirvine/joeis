package irvine.oeis.a213;

import irvine.oeis.LinearRecurrence;

/**
 * A213030.
 * @author Sean A. Irvine
 */
public class A213030 extends LinearRecurrence {

  /** Construct the sequence. */
  public A213030() {
    super(new long[] {1, -1, 0, -2, 2, 0, 1}, new long[] {0, 0, 1, 3, 3, 8, 12});
  }
}
