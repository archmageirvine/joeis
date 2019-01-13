package irvine.oeis.a173;

import irvine.oeis.LinearRecurrence;

/**
 * A173511.
 * @author Sean A. Irvine
 */
public class A173511 extends LinearRecurrence {

  /** Construct the sequence. */
  public A173511() {
    super(new long[] {1, -2, 0, 2}, new long[] {0, 4, 17, 37});
  }
}
