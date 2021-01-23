package irvine.oeis.a067;

import irvine.oeis.LinearRecurrence;

/**
 * A067728 a(n) = 2*n^2 + 8*n.
 * @author Sean A. Irvine
 */
public class A067728 extends LinearRecurrence {

  /** Construct the sequence. */
  public A067728() {
    super(new long[] {1, -3, 3}, new long[] {10, 24, 42});
  }
}
