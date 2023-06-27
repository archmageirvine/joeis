package irvine.oeis.a183;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A183575 a(n) = n - 1 + ceiling((n^2-2)/2); complement of A183574.
 * @author Sean A. Irvine
 */
public class A183575 extends LinearRecurrence {

  /** Construct the sequence. */
  public A183575() {
    super(1, new long[] {1, -2, 0, 2}, new long[] {0, 2, 6, 10});
  }
}
