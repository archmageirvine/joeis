package irvine.oeis.a157;

import irvine.oeis.LinearRecurrence;

/**
 * A157955 200n - 1.
 * @author Sean A. Irvine
 */
public class A157955 extends LinearRecurrence {

  /** Construct the sequence. */
  public A157955() {
    super(new long[] {-1, 2}, new long[] {199, 399});
  }
}
