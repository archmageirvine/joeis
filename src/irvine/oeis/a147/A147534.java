package irvine.oeis.a147;

import irvine.oeis.LinearRecurrence;

/**
 * A147534.
 * @author Sean A. Irvine
 */
public class A147534 extends LinearRecurrence {

  /** Construct the sequence. */
  public A147534() {
    super(new long[] {-1, 1, 0, 1}, new long[] {1, 1, 2, 4});
  }
}
