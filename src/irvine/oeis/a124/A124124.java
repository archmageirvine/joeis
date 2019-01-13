package irvine.oeis.a124;

import irvine.oeis.LinearRecurrence;

/**
 * A124124.
 * @author Sean A. Irvine
 */
public class A124124 extends LinearRecurrence {

  /** Construct the sequence. */
  public A124124() {
    super(new long[] {1, -1, -6, 6, 1}, new long[] {1, 2, 6, 13, 37});
  }
}
