package irvine.oeis.a289;

import irvine.oeis.LinearRecurrence;

/**
 * A289786 p-INVERT of the odd positive integers <code>(A005408)</code>, where <code>p(S) = 1 - S - S^2</code>.
 * @author Sean A. Irvine
 */
public class A289786 extends LinearRecurrence {

  /** Construct the sequence. */
  public A289786() {
    super(new long[] {1, 5, -6, 5}, new long[] {1, 5, 20, 77});
  }
}
