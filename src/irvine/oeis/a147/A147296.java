package irvine.oeis.a147;

import irvine.oeis.LinearRecurrence;

/**
 * A147296 <code>n*(9*n+2)</code>.
 * @author Sean A. Irvine
 */
public class A147296 extends LinearRecurrence {

  /** Construct the sequence. */
  public A147296() {
    super(new long[] {1, -3, 3}, new long[] {0, 11, 40});
  }
}
