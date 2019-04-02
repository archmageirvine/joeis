package irvine.oeis.a134;

import irvine.oeis.LinearRecurrence;

/**
 * A134176 a(n) = (3/8)*(n-1)*(n-2)*(27*n^2-137*n+180).
 * @author Sean A. Irvine
 */
public class A134176 extends LinearRecurrence {

  /** Construct the sequence. */
  public A134176() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {0, 0, 9, 144, 765});
  }
}
