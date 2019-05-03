package irvine.oeis.a289;

import irvine.oeis.LinearRecurrence;

/**
 * A289803 p-INVERT of the even bisection <code>(A001906)</code> of the Fibonacci numbers, where <code>p(S) = 1 - S - S^2</code>.
 * @author Sean A. Irvine
 */
public class A289803 extends LinearRecurrence {

  /** Construct the sequence. */
  public A289803() {
    super(new long[] {-1, 7, -13, 7}, new long[] {1, 5, 23, 103});
  }
}
