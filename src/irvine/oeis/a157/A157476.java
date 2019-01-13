package irvine.oeis.a157;

import irvine.oeis.LinearRecurrence;

/**
 * A157476.
 * @author Sean A. Irvine
 */
public class A157476 extends LinearRecurrence {

  /** Construct the sequence. */
  public A157476() {
    super(new long[] {1, -3, 3}, new long[] {2177, 8449, 18817});
  }
}
