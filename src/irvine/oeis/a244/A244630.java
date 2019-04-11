package irvine.oeis.a244;

import irvine.oeis.LinearRecurrence;

/**
 * A244630 <code>a(n) = 17*n^2</code>.
 * @author Sean A. Irvine
 */
public class A244630 extends LinearRecurrence {

  /** Construct the sequence. */
  public A244630() {
    super(new long[] {1, -3, 3}, new long[] {0, 17, 68});
  }
}
