package irvine.oeis.a071;

import irvine.oeis.LinearRecurrence;

/**
 * A071239 a(n) = n*(n+1)*(n^2+2)/6.
 * @author Sean A. Irvine
 */
public class A071239 extends LinearRecurrence {

  /** Construct the sequence. */
  public A071239() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {0, 1, 6, 22, 60});
  }
}
