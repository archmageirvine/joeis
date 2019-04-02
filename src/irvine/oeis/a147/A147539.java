package irvine.oeis.a147;

import irvine.oeis.LinearRecurrence;

/**
 * A147539 Numbers whose binary representation is the concatenation of n 1's, 2n-1 digits 0 and n 1's.
 * @author Sean A. Irvine
 */
public class A147539 extends LinearRecurrence {

  /** Construct the sequence. */
  public A147539() {
    super(new long[] {-256, 432, -202, 27}, new long[] {5, 99, 1799, 30735});
  }
}
