package irvine.oeis.a144;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A144449 a(n) = 4*(4 + 9*n^2 + 15*n).
 * @author Sean A. Irvine
 */
public class A144449 extends LinearRecurrence {

  /** Construct the sequence. */
  public A144449() {
    super(new long[] {1, -3, 3}, new long[] {16, 112, 280});
  }
}
