package irvine.oeis.a183;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A183859 a(n) = n - 1 + ceiling((n^2)/3); complement of A183858.
 * @author Sean A. Irvine
 */
public class A183859 extends LinearRecurrence {

  /** Construct the sequence. */
  public A183859() {
    super(1, new long[] {1, -2, 1, -1, 2}, new long[] {1, 3, 5, 9, 13});
  }
}
