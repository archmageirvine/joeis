package irvine.oeis.a111;

import irvine.oeis.LinearRecurrence;

/**
 * A111733.
 * @author Sean A. Irvine
 */
public class A111733 extends LinearRecurrence {

  /** Construct the sequence. */
  public A111733() {
    super(new long[] {-1, 0, 2}, new long[] {1, 1, 9});
  }
}
