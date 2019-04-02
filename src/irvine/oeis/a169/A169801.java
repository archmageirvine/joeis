package irvine.oeis.a169;

import irvine.oeis.LinearRecurrence;

/**
 * A169801 a(n) = ((n-1)^2*n^2*(n+1)^2)/6 - 2*Sum_{l=2..n}Sum_{k=2..n}(n-k+1)*(n-l+1)*(k-1)*(l-1).
 * @author Sean A. Irvine
 */
public class A169801 extends LinearRecurrence {

  /** Construct the sequence. */
  public A169801() {
    super(new long[] {1, -7, 21, -35, 35, -21, 7}, new long[] {0, 0, 4, 64, 400, 1600, 4900});
  }
}
