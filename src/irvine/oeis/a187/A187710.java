package irvine.oeis.a187;

import irvine.oeis.LinearRecurrence;

/**
 * A187710.
 * @author Sean A. Irvine
 */
public class A187710 extends LinearRecurrence {

  /** Construct the sequence. */
  public A187710() {
    super(new long[] {1, -3, 3}, new long[] {10, 12, 16});
  }
}
