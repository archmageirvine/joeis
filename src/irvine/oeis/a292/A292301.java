package irvine.oeis.a292;

import irvine.oeis.LinearRecurrence;

/**
 * A292301 p-INVERT of <code>A010892</code>, where <code>p(S) = 1 + S - S^2</code>.
 * @author Sean A. Irvine
 */
public class A292301 extends LinearRecurrence {

  /** Construct the sequence. */
  public A292301() {
    super(new long[] {-1, 1, -1, 1}, new long[] {-1, 1, 1, -1});
  }
}
