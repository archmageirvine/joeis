package irvine.oeis.a147;

import irvine.oeis.LinearRecurrence;

/**
 * A147538 Numbers whose binary representation is the concatenation of <code>n 1</code>'s and <code>2n-1</code> digits 0.
 * @author Sean A. Irvine
 */
public class A147538 extends LinearRecurrence {

  /** Construct the sequence. */
  public A147538() {
    super(new long[] {-32, 12}, new long[] {2, 24});
  }
}
