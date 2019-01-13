package irvine.oeis.a147;

import irvine.oeis.LinearRecurrence;

/**
 * A147875.
 * @author Sean A. Irvine
 */
public class A147875 extends LinearRecurrence {

  /** Construct the sequence. */
  public A147875() {
    super(new long[] {1, -3, 3}, new long[] {0, 4, 13});
  }
}
