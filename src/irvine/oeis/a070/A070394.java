package irvine.oeis.a070;

import irvine.oeis.LinearRecurrence;

/**
 * A070394 a(n) = 6^n mod 17.
 * @author Sean A. Irvine
 */
public class A070394 extends LinearRecurrence {

  /** Construct the sequence. */
  public A070394() {
    super(new long[] {1, -1, 0, 0, 0, 0, 0, 0, 1}, new long[] {1, 6, 2, 12, 4, 7, 8, 14, 16});
  }
}
