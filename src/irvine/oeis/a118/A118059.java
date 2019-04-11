package irvine.oeis.a118;

import irvine.oeis.LinearRecurrence;

/**
 * A118059 <code>288*n^2 - 168*n - 119</code>.
 * @author Sean A. Irvine
 */
public class A118059 extends LinearRecurrence {

  /** Construct the sequence. */
  public A118059() {
    super(new long[] {1, -3, 3}, new long[] {1, 697, 1969});
  }
}
