package irvine.oeis.a229;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A229525 Sum of coefficients of the transform ax^2 + (4a/k - b)x + 4a/k^2 + 2b/k + c = 0 for a,b,c = 1,-1,-1, k = 1,2,3...
 * @author Sean A. Irvine
 */
public class A229525 extends LinearRecurrence {

  /** Construct the sequence. */
  public A229525() {
    super(new long[] {1, 0, -3, 0, 3, 0}, new long[] {11, 5, 31, 11, 59, 19});
  }
}
