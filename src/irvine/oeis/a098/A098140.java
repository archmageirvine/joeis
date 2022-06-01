package irvine.oeis.a098;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A098140 63-gonal numbers: a(n) = n*(61*n - 59)/2.
 * @author Sean A. Irvine
 */
public class A098140 extends LinearRecurrence {

  /** Construct the sequence. */
  public A098140() {
    super(new long[] {1, -3, 3}, new long[] {0, 1, 63});
  }
}
