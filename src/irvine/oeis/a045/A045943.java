package irvine.oeis.a045;

import irvine.oeis.LinearRecurrence;

/**
 * A045943 Triangular matchstick numbers: <code>a(n) = 3*n*(n+1)/2</code>.
 * @author Sean A. Irvine
 */
public class A045943 extends LinearRecurrence {

  /** Construct the sequence. */
  public A045943() {
    super(new long[] {1, -3, 3}, new long[] {0, 3, 9});
  }
}
