package irvine.oeis.a133;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A133654 a(n) = 2*A000129(n) - 1.
 * @author Sean A. Irvine
 */
public class A133654 extends LinearRecurrence {

  /** Construct the sequence. */
  public A133654() {
    super(new long[] {-1, -1, 3}, new long[] {1, 3, 9});
  }
}
