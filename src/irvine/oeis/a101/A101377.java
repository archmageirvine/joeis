package irvine.oeis.a101;

import irvine.oeis.LinearRecurrence;

/**
 * A101377 <code>a(n) = n^2*(n^3-n+2)/2</code>.
 * @author Sean A. Irvine
 */
public class A101377 extends LinearRecurrence {

  /** Construct the sequence. */
  public A101377() {
    super(new long[] {-1, 6, -15, 20, -15, 6}, new long[] {0, 1, 16, 117, 496, 1525});
  }
}
