package irvine.oeis.a115;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A115067 a(n) = (3*n^2 - n - 2)/2.
 * @author Sean A. Irvine
 */
public class A115067 extends LinearRecurrence {

  /** Construct the sequence. */
  public A115067() {
    super(new long[] {1, -3, 3}, new long[] {0, 4, 11});
  }
}
