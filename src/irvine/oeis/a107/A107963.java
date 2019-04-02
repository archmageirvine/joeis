package irvine.oeis.a107;

import irvine.oeis.LinearRecurrence;

/**
 * A107963 a(n) = (n+1)*(n+2)*(n+3)*(n+4)*(5*n^2 + 19*n + 15)/360.
 * @author Sean A. Irvine
 */
public class A107963 extends LinearRecurrence {

  /** Construct the sequence. */
  public A107963() {
    super(new long[] {1, -7, 21, -35, 35, -21, 7}, new long[] {1, 13, 73, 273, 798, 1974, 4326});
  }
}
