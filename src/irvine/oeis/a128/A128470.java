package irvine.oeis.a128;

import irvine.oeis.LinearRecurrence;

/**
 * A128470 a(n) = 30*n + 1.
 * @author Sean A. Irvine
 */
public class A128470 extends LinearRecurrence {

  /** Construct the sequence. */
  public A128470() {
    super(new long[] {-1, 2}, new long[] {1, 31});
  }
}
