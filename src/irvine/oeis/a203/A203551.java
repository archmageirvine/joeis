package irvine.oeis.a203;

import irvine.oeis.LinearRecurrence;

/**
 * A203551 <code>a(n) = n*(5n^2 + 3n + 4) / 6</code>.
 * @author Sean A. Irvine
 */
public class A203551 extends LinearRecurrence {

  /** Construct the sequence. */
  public A203551() {
    super(new long[] {-1, 4, -6, 4}, new long[] {0, 2, 10, 29});
  }
}
