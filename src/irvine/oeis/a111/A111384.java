package irvine.oeis.a111;

import irvine.oeis.LinearRecurrence;

/**
 * A111384.
 * @author Sean A. Irvine
 */
public class A111384 extends LinearRecurrence {

  /** Construct the sequence. */
  public A111384() {
    super(new long[] {-1, 2, 1, -4, 1, 2}, new long[] {0, 0, 0, 1, 4, 9});
  }
}
