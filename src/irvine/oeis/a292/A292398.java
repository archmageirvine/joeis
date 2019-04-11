package irvine.oeis.a292;

import irvine.oeis.LinearRecurrence;

/**
 * A292398 p-INVERT of A010892, where p(S) <code>= 1 -</code> S - S^2 - S^3.
 * @author Sean A. Irvine
 */
public class A292398 extends LinearRecurrence {

  /** Construct the sequence. */
  public A292398() {
    super(new long[] {1, 4, 1, -6, -1, 4}, new long[] {1, 3, 10, 32, 102, 323});
  }
}
