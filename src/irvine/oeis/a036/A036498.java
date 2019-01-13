package irvine.oeis.a036;

import irvine.oeis.LinearRecurrence;

/**
 * A036498.
 * @author Sean A. Irvine
 */
public class A036498 extends LinearRecurrence {

  /** Construct the sequence. */
  public A036498() {
    super(new long[] {1, -1, -2, 2, 1}, new long[] {0, 5, 7, 22, 26});
  }
}
