package irvine.oeis.a144;

import irvine.oeis.LinearRecurrence;

/**
 * A144449 a(n) = 36*n^2 + 60*n + 16.
 * @author Sean A. Irvine
 */
public class A144449 extends LinearRecurrence {

  /** Construct the sequence. */
  public A144449() {
    super(new long[] {1, -3, 3}, new long[] {16, 112, 280});
  }
}
