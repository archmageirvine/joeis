package irvine.oeis.a294;

import irvine.oeis.LinearRecurrence;

/**
 * A294262 a(n) = 3*a(n-1) + 5*a(n-2) + a(n-3), with a(0) = a(1) = 1 and a(2) = 7, a linear recurrence which is a trisection of A005252.
 * @author Sean A. Irvine
 */
public class A294262 extends LinearRecurrence {

  /** Construct the sequence. */
  public A294262() {
    super(new long[] {1, 5, 3}, new long[] {1, 1, 7});
  }
}
