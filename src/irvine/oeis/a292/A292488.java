package irvine.oeis.a292;

import irvine.oeis.LinearRecurrence;

/**
 * A292488 p-INVERT of the odd positive integers, where p(S) <code>= 1 -</code> S <code>- 5</code> S^2.
 * @author Sean A. Irvine
 */
public class A292488 extends LinearRecurrence {

  /** Construct the sequence. */
  public A292488() {
    super(new long[] {5, 13, -2, 5}, new long[] {1, 9, 52, 261});
  }
}
