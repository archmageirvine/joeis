package irvine.oeis.a147;

import irvine.oeis.LinearRecurrence;

/**
 * A147816.
 * @author Sean A. Irvine
 */
public class A147816 extends LinearRecurrence {

  /** Construct the sequence. */
  public A147816() {
    super(new long[] {-100000, 1100}, new long[] {1, 1100});
  }
}
