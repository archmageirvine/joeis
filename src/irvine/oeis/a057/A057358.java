package irvine.oeis.a057;

import irvine.oeis.LinearRecurrence;

/**
 * A057358 a(n) = floor(4*n/7).
 * @author Sean A. Irvine
 */
public class A057358 extends LinearRecurrence {

  /** Construct the sequence. */
  public A057358() {
    super(new long[] {-1, 1, 0, 0, 0, 0, 0, 1}, new long[] {0, 0, 1, 1, 2, 2, 3, 4});
  }
}
