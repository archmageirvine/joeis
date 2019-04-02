package irvine.oeis.a227;

import irvine.oeis.LinearRecurrence;

/**
 * A227786 Take squares larger than 1, subtract 3 from even squares and 2 from odd squares; a(n) = a(n-1) + A168276(n+1) (with a(1) = 1).
 * @author Sean A. Irvine
 */
public class A227786 extends LinearRecurrence {

  /** Construct the sequence. */
  public A227786() {
    super(new long[] {1, -2, 0, 2}, new long[] {1, 7, 13, 23});
  }
}
