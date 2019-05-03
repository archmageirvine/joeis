package irvine.oeis.a292;

import irvine.oeis.LinearRecurrence;

/**
 * A292489 p-INVERT of the odd positive integers, where <code>p(S) = 1 - S - 6 S^2</code>.
 * @author Sean A. Irvine
 */
public class A292489 extends LinearRecurrence {

  /** Construct the sequence. */
  public A292489() {
    super(new long[] {6, 15, -1, 5}, new long[] {1, 10, 60, 312});
  }
}
