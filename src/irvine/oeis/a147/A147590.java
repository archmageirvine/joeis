package irvine.oeis.a147;

import irvine.oeis.LinearRecurrence;

/**
 * A147590 Numbers whose binary representation is the concatenation of <code>2n-1</code> digits 1 and <code>n-1</code> digits 0.
 * @author Sean A. Irvine
 */
public class A147590 extends LinearRecurrence {

  /** Construct the sequence. */
  public A147590() {
    super(new long[] {-16, 10}, new long[] {1, 14});
  }
}
