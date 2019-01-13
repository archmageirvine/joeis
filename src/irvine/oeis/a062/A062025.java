package irvine.oeis.a062;

import irvine.oeis.LinearRecurrence;

/**
 * A062025.
 * @author Sean A. Irvine
 */
public class A062025 extends LinearRecurrence {

  /** Construct the sequence. */
  public A062025() {
    super(new long[] {-1, 4, -6, 4}, new long[] {0, 1, 15, 55});
  }
}
