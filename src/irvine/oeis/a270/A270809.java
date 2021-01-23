package irvine.oeis.a270;

import irvine.oeis.LinearRecurrence;

/**
 * A270809 a(n) = n^3/3 - 7*n/3 + 4.
 * @author Sean A. Irvine
 */
public class A270809 extends LinearRecurrence {

  /** Construct the sequence. */
  public A270809() {
    super(new long[] {-1, 4, -6, 4}, new long[] {4, 2, 2, 6});
  }
}
