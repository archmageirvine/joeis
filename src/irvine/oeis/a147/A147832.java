package irvine.oeis.a147;

import irvine.oeis.LinearRecurrence;

/**
 * A147832.
 * @author Sean A. Irvine
 */
public class A147832 extends LinearRecurrence {

  /** Construct the sequence. */
  public A147832() {
    super(new long[] {-1, 1, 1}, new long[] {0, 2, 14});
  }
}
