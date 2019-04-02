package irvine.oeis.a022;

import irvine.oeis.LinearRecurrence;

/**
 * A022269 a(n) = n*(11*n+1)/2.
 * @author Sean A. Irvine
 */
public class A022269 extends LinearRecurrence {

  /** Construct the sequence. */
  public A022269() {
    super(new long[] {1, -3, 3}, new long[] {0, 6, 23});
  }
}
