package irvine.oeis.a147;

import irvine.oeis.LinearRecurrence;

/**
 * A147874.
 * @author Sean A. Irvine
 */
public class A147874 extends LinearRecurrence {

  /** Construct the sequence. */
  public A147874() {
    super(new long[] {1, -3, 3}, new long[] {0, 3, 16});
  }
}
