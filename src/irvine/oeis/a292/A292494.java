package irvine.oeis.a292;

import irvine.oeis.LinearRecurrence;

/**
 * A292494 p-INVERT of the odd positive integers, where p(S) <code>= 1 -</code> S - S^2 - S^3.
 * @author Sean A. Irvine
 */
public class A292494 extends LinearRecurrence {

  /** Construct the sequence. */
  public A292494() {
    super(new long[] {2, 6, -12, 23, -17, 7}, new long[] {1, 5, 21, 88, 362, 1470});
  }
}
