package irvine.oeis.a183;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A183857 a(n) = n - 1 + ceiling((2/3)*n^2); complement of A183874.
 * @author Sean A. Irvine
 */
public class A183857 extends LinearRecurrence {

  /** Construct the sequence. */
  public A183857() {
    super(1, new long[] {1, -2, 1, -1, 2}, new long[] {1, 4, 8, 14, 21});
  }
}
