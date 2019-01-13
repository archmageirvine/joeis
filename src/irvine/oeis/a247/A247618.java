package irvine.oeis.a247;

import irvine.oeis.LinearRecurrence;

/**
 * A247618.
 * @author Sean A. Irvine
 */
public class A247618 extends LinearRecurrence {

  /** Construct the sequence. */
  public A247618() {
    super(new long[] {2, -5, 4}, new long[] {1, 5, 17});
  }
}
