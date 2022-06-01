package irvine.oeis.a241;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A241750 a(n) = n^2 + 15.
 * @author Sean A. Irvine
 */
public class A241750 extends LinearRecurrence {

  /** Construct the sequence. */
  public A241750() {
    super(new long[] {1, -3, 3}, new long[] {15, 16, 19});
  }
}
