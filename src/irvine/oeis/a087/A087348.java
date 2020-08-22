package irvine.oeis.a087;

import irvine.oeis.LinearRecurrence;

/**
 * A087348 a(n) = 10*n^2 - 6*n + 1.
 * @author Sean A. Irvine
 */
public class A087348 extends LinearRecurrence {

  /** Construct the sequence. */
  public A087348() {
    super(new long[] {1, -3, 3}, new long[] {5, 29, 73});
  }
}
