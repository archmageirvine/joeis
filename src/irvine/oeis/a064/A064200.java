package irvine.oeis.a064;

import irvine.oeis.LinearRecurrence;

/**
 * A064200 a(n) = 12*n*(n-1).
 * @author Sean A. Irvine
 */
public class A064200 extends LinearRecurrence {

  /** Construct the sequence. */
  public A064200() {
    super(new long[] {1, -3, 3}, new long[] {0, 0, 24});
  }
}
