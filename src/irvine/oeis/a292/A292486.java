package irvine.oeis.a292;

import irvine.oeis.LinearRecurrence;

/**
 * A292486 p-INVERT of the odd positive integers, where <code>p(S) = 1 - S - 3 S^2</code>.
 * @author Sean A. Irvine
 */
public class A292486 extends LinearRecurrence {

  /** Construct the sequence. */
  public A292486() {
    super(new long[] {3, 9, -4, 5}, new long[] {1, 7, 36, 165});
  }
}
