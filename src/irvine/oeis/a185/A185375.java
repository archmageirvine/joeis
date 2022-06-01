package irvine.oeis.a185;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A185375 a(n) = n*(n-1)*(2*n+1)*(2*n-1)*(2*n-3)*(10*n-17)/90.
 * @author Sean A. Irvine
 */
public class A185375 extends LinearRecurrence {

  /** Construct the sequence. */
  public A185375() {
    super(new long[] {1, -7, 21, -35, 35, -21, 7}, new long[] {0, 0, 1, 91, 966, 5082, 18447});
  }
}
