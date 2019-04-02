package irvine.oeis.a134;

import irvine.oeis.LinearRecurrence;

/**
 * A134594 a(n) = n^2 + 10*n + 5: coefficients of the irrational part of (1 + sqrt(n))^5.
 * @author Sean A. Irvine
 */
public class A134594 extends LinearRecurrence {

  /** Construct the sequence. */
  public A134594() {
    super(new long[] {1, -3, 3}, new long[] {5, 16, 29});
  }
}
