package irvine.oeis.a289;

import irvine.oeis.LinearRecurrence;

/**
 * A289804 p-INVERT of the even bisection <code>(A001519)</code> of the Fibonacci numbers, where <code>p(S) = 1 - S - S^2</code>.
 * @author Sean A. Irvine
 */
public class A289804 extends LinearRecurrence {

  /** Construct the sequence. */
  public A289804() {
    super(new long[] {1, 9, -15, 7}, new long[] {1, 3, 9, 29});
  }
}
