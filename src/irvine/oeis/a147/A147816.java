package irvine.oeis.a147;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A147816 Concatenation of n digits 1 and 2(n-1) digits 0.
 * @author Sean A. Irvine
 */
public class A147816 extends LinearRecurrence {

  /** Construct the sequence. */
  public A147816() {
    super(1, new long[] {-100000, 1100}, new long[] {1, 1100});
  }
}
