package irvine.oeis.a294;

import irvine.oeis.LinearRecurrence;

/**
 * A294262 <code>a(n) = 3*a(n-1) + 5*a(n-2) + a(n-3)</code>, with <code>a(0) = a(1) = 1</code> and <code>a(2) = 7</code>, a linear recurrence which is a trisection of <code>A005252</code>.
 * @author Sean A. Irvine
 */
public class A294262 extends LinearRecurrence {

  /** Construct the sequence. */
  public A294262() {
    super(new long[] {1, 5, 3}, new long[] {1, 1, 7});
  }
}
