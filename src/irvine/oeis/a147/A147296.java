package irvine.oeis.a147;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A147296 n*(9*n+2).
 * @author Sean A. Irvine
 */
public class A147296 extends LinearRecurrence {

  /** Construct the sequence. */
  public A147296() {
    super(new long[] {1, -3, 3}, new long[] {0, 11, 40});
  }
}
