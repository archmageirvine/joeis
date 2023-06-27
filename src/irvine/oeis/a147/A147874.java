package irvine.oeis.a147;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A147874 a(n) = (5*n-7)*(n-1).
 * @author Sean A. Irvine
 */
public class A147874 extends LinearRecurrence {

  /** Construct the sequence. */
  public A147874() {
    super(1, new long[] {1, -3, 3}, new long[] {0, 3, 16});
  }
}
