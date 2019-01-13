package irvine.oeis.a062;

import irvine.oeis.LinearRecurrence;

/**
 * A062026.
 * @author Sean A. Irvine
 */
public class A062026 extends LinearRecurrence {

  /** Construct the sequence. */
  public A062026() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {0, 2, 6, 18, 50});
  }
}
