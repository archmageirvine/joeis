package irvine.oeis.a147;

import irvine.oeis.LinearRecurrence;

/**
 * A147601.
 * @author Sean A. Irvine
 */
public class A147601 extends LinearRecurrence {

  /** Construct the sequence. */
  public A147601() {
    super(new long[] {-1, 0, 2, 0}, new long[] {7, 4, 21, 8});
  }
}
