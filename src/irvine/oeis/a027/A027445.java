package irvine.oeis.a027;

import irvine.oeis.LinearRecurrence;

/**
 * A027445 a(n) = n^4 + n^3 + n^2 + n^1.
 * @author Sean A. Irvine
 */
public class A027445 extends LinearRecurrence {

  /** Construct the sequence. */
  public A027445() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {0, 4, 30, 120, 340});
  }
}
