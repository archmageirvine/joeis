package irvine.oeis.a103;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A103220 a(n) = n*(n+1)*(3*n^2+n-1)/6.
 * @author Sean A. Irvine
 */
public class A103220 extends LinearRecurrence {

  /** Construct the sequence. */
  public A103220() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {0, 1, 13, 58, 170});
  }
}
