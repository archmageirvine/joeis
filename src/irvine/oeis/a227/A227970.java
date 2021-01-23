package irvine.oeis.a227;

import irvine.oeis.LinearRecurrence;

/**
 * A227970 Triangular arithmetic on half-squares: b(n)*(b(n) - 1)/2 where b(n) = floor(n^2/2).
 * @author Sean A. Irvine
 */
public class A227970 extends LinearRecurrence {

  /** Construct the sequence. */
  public A227970() {
    super(new long[] {1, -2, -2, 6, 0, -6, 2, 2}, new long[] {0, 0, 1, 6, 28, 66, 153, 276});
  }
}
