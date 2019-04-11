package irvine.oeis.a147;

import irvine.oeis.LinearRecurrence;

/**
 * A147874 <code>a(n) = (5*n-7)*(n-1)</code>.
 * @author Sean A. Irvine
 */
public class A147874 extends LinearRecurrence {

  /** Construct the sequence. */
  public A147874() {
    super(new long[] {1, -3, 3}, new long[] {0, 3, 16});
  }
}
