package irvine.oeis.a085;

import irvine.oeis.LinearRecurrence;

/**
 * A085473 a(n) = 6*n^2 + 3*n + 1.
 * @author Sean A. Irvine
 */
public class A085473 extends LinearRecurrence {

  /** Construct the sequence. */
  public A085473() {
    super(new long[] {1, -3, 3}, new long[] {1, 10, 31});
  }
}
