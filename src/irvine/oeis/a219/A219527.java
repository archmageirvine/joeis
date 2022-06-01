package irvine.oeis.a219;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A219527 a(n) = (6*n^2 + 7*n - 9 + 2*n^3)/12 - (-1)^n*(n+1)/4.
 * @author Sean A. Irvine
 */
public class A219527 extends LinearRecurrence {

  /** Construct the sequence. */
  public A219527() {
    super(new long[] {-1, 2, 1, -4, 1, 2}, new long[] {1, 3, 11, 19, 37, 55});
  }
}
