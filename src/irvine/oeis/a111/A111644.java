package irvine.oeis.a111;

import irvine.oeis.LinearRecurrence;

/**
 * A111644.
 * @author Sean A. Irvine
 */
public class A111644 extends LinearRecurrence {

  /** Construct the sequence. */
  public A111644() {
    super(new long[] {1, 2, -8, -6}, new long[] {1, -6, 29, -124});
  }
}
