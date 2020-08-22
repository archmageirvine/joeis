package irvine.oeis.a027;

import irvine.oeis.LinearRecurrence;

/**
 * A027382 a(n) = n^4 - 6*n^3 + 12*n^2 - 4*n + 1.
 * @author Sean A. Irvine
 */
public class A027382 extends LinearRecurrence {

  /** Construct the sequence. */
  public A027382() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {1, 4, 9, 16, 49});
  }
}
