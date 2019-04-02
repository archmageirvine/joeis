package irvine.oeis.a050;

import irvine.oeis.LinearRecurrence;

/**
 * A050410 Truncated square pyramid numbers: a(n) = Sum_{k = n..2*n-1} k^2.
 * @author Sean A. Irvine
 */
public class A050410 extends LinearRecurrence {

  /** Construct the sequence. */
  public A050410() {
    super(new long[] {-1, 4, -6, 4}, new long[] {0, 1, 13, 50});
  }
}
