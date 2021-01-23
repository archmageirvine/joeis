package irvine.oeis.a063;

import irvine.oeis.LinearRecurrence;

/**
 * A063491 a(n) = (2*n - 1)*(3*n^2 - 3*n + 2)/2.
 * @author Sean A. Irvine
 */
public class A063491 extends LinearRecurrence {

  /** Construct the sequence. */
  public A063491() {
    super(new long[] {-1, 4, -6, 4}, new long[] {1, 12, 50, 133});
  }
}
