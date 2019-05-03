package irvine.oeis.a292;

import irvine.oeis.LinearRecurrence;

/**
 * A292327 p-INVERT of the Fibonacci sequence <code>(A000045)</code>, where <code>p(S) = (1 - S)^2</code>.
 * @author Sean A. Irvine
 */
public class A292327 extends LinearRecurrence {

  /** Construct the sequence. */
  public A292327() {
    super(new long[] {-1, -4, -2, 4}, new long[] {2, 5, 14, 38});
  }
}
