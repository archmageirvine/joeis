package irvine.oeis.a147;

import irvine.oeis.LinearRecurrence;

/**
 * A147973 <code>a(n) = -2*n^2 + 12*n - 14</code>.
 * @author Sean A. Irvine
 */
public class A147973 extends LinearRecurrence {

  /** Construct the sequence. */
  public A147973() {
    super(new long[] {1, -3, 3}, new long[] {-4, 2, 4});
  }
}
