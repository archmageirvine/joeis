package irvine.oeis.a289;

import irvine.oeis.LinearRecurrence;

/**
 * A289781 p-INVERT of the positive Fibonacci numbers <code>(A000045)</code>, where <code>p(S) = 1 - S - S^2</code>.
 * @author Sean A. Irvine
 */
public class A289781 extends LinearRecurrence {

  /** Construct the sequence. */
  public A289781() {
    super(new long[] {-1, -3, 1, 3}, new long[] {1, 3, 9, 27});
  }
}
