package irvine.oeis.a292;

import irvine.oeis.LinearRecurrence;

/**
 * A292301 p-INVERT of A010892, where p(S) <code>= 1 +</code> S - S^2.
 * @author Sean A. Irvine
 */
public class A292301 extends LinearRecurrence {

  /** Construct the sequence. */
  public A292301() {
    super(new long[] {-1, 1, -1, 1}, new long[] {-1, 1, 1, -1});
  }
}
