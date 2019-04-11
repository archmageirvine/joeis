package irvine.oeis.a133;

import irvine.oeis.LinearRecurrence;

/**
 * A133070 <code>a(n) = n^5 - n^3 - n^2</code>.
 * @author Sean A. Irvine
 */
public class A133070 extends LinearRecurrence {

  /** Construct the sequence. */
  public A133070() {
    super(new long[] {-1, 6, -15, 20, -15, 6}, new long[] {0, -1, 20, 207, 944, 2975});
  }
}
