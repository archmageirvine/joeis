package irvine.oeis.a247;

import irvine.oeis.LinearRecurrence;

/**
 * A247125.
 * @author Sean A. Irvine
 */
public class A247125 extends LinearRecurrence {

  /** Construct the sequence. */
  public A247125() {
    super(new long[] {2, 6, 12, 1, 2, 0}, new long[] {1, 0, 2, 1, 16, 10});
  }
}
