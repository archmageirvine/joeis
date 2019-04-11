package irvine.oeis.a286;

import irvine.oeis.LinearRecurrence;

/**
 * A286283 <code>a(n) = floor(7*n^2/48)</code>.
 * @author Sean A. Irvine
 */
public class A286283 extends LinearRecurrence {

  /** Construct the sequence. */
  public A286283() {
    super(new long[] {1, -2, 2, -2, 1, 0, -1, 2, -2, 2, -1, 0, 1, -2, 2, -2, 1, 0, -1, 2, -2, 2}, new long[] {0, 0, 0, 1, 2, 3, 5, 7, 9, 11, 14, 17, 21, 24, 28, 32, 37, 42, 47, 52, 58, 64});
  }
}
