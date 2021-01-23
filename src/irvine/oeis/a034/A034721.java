package irvine.oeis.a034;

import irvine.oeis.LinearRecurrence;

/**
 * A034721 a(n) = (10*n^3 - 9*n^2 + 2*n)/3 + 1.
 * @author Sean A. Irvine
 */
public class A034721 extends LinearRecurrence {

  /** Construct the sequence. */
  public A034721() {
    super(new long[] {-1, 4, -6, 4}, new long[] {1, 2, 17, 66});
  }
}
