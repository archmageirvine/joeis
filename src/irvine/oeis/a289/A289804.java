package irvine.oeis.a289;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A289804 p-INVERT of the even bisection (A001519) of the Fibonacci numbers, where p(S) = 1 - S - S^2.
 * @author Sean A. Irvine
 */
public class A289804 extends LinearRecurrence {

  /** Construct the sequence. */
  public A289804() {
    super(new long[] {1, 9, -15, 7}, new long[] {1, 3, 9, 29});
  }
}
