package irvine.oeis.a158;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A158399 784n - 1.
 * @author Sean A. Irvine
 */
public class A158399 extends LinearRecurrence {

  /** Construct the sequence. */
  public A158399() {
    super(1, new long[] {-1, 2}, new long[] {783, 1567});
  }
}
