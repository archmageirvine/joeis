package irvine.oeis.a106;

import irvine.oeis.LinearRecurrence;

/**
 * A106257 Numbers k such that k^2 <code>= 12*n^2 + 13</code>.
 * @author Sean A. Irvine
 */
public class A106257 extends LinearRecurrence {

  /** Construct the sequence. */
  public A106257() {
    super(new long[] {-1, 0, 14, 0}, new long[] {5, 11, 59, 149});
  }
}
