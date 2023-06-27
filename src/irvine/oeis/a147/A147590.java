package irvine.oeis.a147;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A147590 Numbers whose binary representation is the concatenation of 2n-1 digits 1 and n-1 digits 0.
 * @author Sean A. Irvine
 */
public class A147590 extends LinearRecurrence {

  /** Construct the sequence. */
  public A147590() {
    super(1, new long[] {-16, 10}, new long[] {1, 14});
  }
}
