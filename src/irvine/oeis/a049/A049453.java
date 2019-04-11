package irvine.oeis.a049;

import irvine.oeis.LinearRecurrence;

/**
 * A049453 Second pentagonal numbers with even index: <code>a(n) = n*(6*n+1)</code>.
 * @author Sean A. Irvine
 */
public class A049453 extends LinearRecurrence {

  /** Construct the sequence. */
  public A049453() {
    super(new long[] {1, -3, 3}, new long[] {0, 7, 26});
  }
}
