package irvine.oeis.a178;

import irvine.oeis.LinearRecurrence;

/**
 * A178242 Numerator of <code>n*(5+n)/((n+1)*(n+4))</code>.
 * @author Sean A. Irvine
 */
public class A178242 extends LinearRecurrence {

  /** Construct the sequence. */
  public A178242() {
    super(new long[] {1, -3, 6, -10, 12, -12, 10, -6, 3}, new long[] {0, 3, 7, 6, 9, 25, 33, 21, 26});
  }
}
