package irvine.oeis.a101;

import irvine.oeis.LinearRecurrence;

/**
 * A101859 <code>a(n) = 11 + (23*n)/2 + n^2/2</code>.
 * @author Sean A. Irvine
 */
public class A101859 extends LinearRecurrence {

  /** Construct the sequence. */
  public A101859() {
    super(new long[] {1, -3, 3}, new long[] {0, 11, 23});
  }
}
