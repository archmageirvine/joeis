package irvine.oeis.a147;

import irvine.oeis.LinearRecurrence;

/**
 * A147816 Concatenation of n digits 1 and <code>2(n-1)</code> digits 0.
 * @author Sean A. Irvine
 */
public class A147816 extends LinearRecurrence {

  /** Construct the sequence. */
  public A147816() {
    super(new long[] {-100000, 1100}, new long[] {1, 1100});
  }
}
