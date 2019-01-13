package irvine.oeis.a173;

import irvine.oeis.LinearRecurrence;

/**
 * A173200.
 * @author Sean A. Irvine
 */
public class A173200 extends LinearRecurrence {

  /** Construct the sequence. */
  public A173200() {
    super(new long[] {-1, 4, -6, 4}, new long[] {0, 11, 70, 225});
  }
}
