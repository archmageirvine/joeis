package irvine.oeis.a022;

import irvine.oeis.LinearRecurrence;

/**
 * A022287 a(n) = n*(29*n + 1)/2.
 * @author Sean A. Irvine
 */
public class A022287 extends LinearRecurrence {

  /** Construct the sequence. */
  public A022287() {
    super(new long[] {1, -3, 3}, new long[] {0, 15, 59});
  }
}
