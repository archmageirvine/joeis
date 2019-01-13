package irvine.oeis.a147;

import irvine.oeis.LinearRecurrence;

/**
 * A147759.
 * @author Sean A. Irvine
 */
public class A147759 extends LinearRecurrence {

  /** Construct the sequence. */
  public A147759() {
    super(new long[] {-100, 110, -20, 11}, new long[] {1, 11, 101, 1001});
  }
}
