package irvine.oeis.a147;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A147538 Numbers whose binary representation is the concatenation of n 1's and 2n-1 digits 0.
 * @author Sean A. Irvine
 */
public class A147538 extends LinearRecurrence {

  /** Construct the sequence. */
  public A147538() {
    super(1, new long[] {-32, 12}, new long[] {2, 24});
  }
}
