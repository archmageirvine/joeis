package irvine.oeis.a254;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A254963 a(n) = n*(11*n + 3)/2.
 * @author Sean A. Irvine
 */
public class A254963 extends LinearRecurrence {

  /** Construct the sequence. */
  public A254963() {
    super(new long[] {1, -3, 3}, new long[] {0, 7, 25});
  }
}
