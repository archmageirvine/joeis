package irvine.oeis.a241;

import irvine.oeis.LinearRecurrence;

/**
 * A241889 a(n) = n^2 + 23.
 * @author Sean A. Irvine
 */
public class A241889 extends LinearRecurrence {

  /** Construct the sequence. */
  public A241889() {
    super(new long[] {1, -3, 3}, new long[] {23, 24, 27});
  }
}
