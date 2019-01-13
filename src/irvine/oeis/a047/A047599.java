package irvine.oeis.a047;

import irvine.oeis.LinearRecurrence;

/**
 * A047599.
 * @author Sean A. Irvine
 */
public class A047599 extends LinearRecurrence {

  /** Construct the sequence. */
  public A047599() {
    super(new long[] {-1, 2, -2, 2}, new long[] {0, 3, 4, 5});
  }
}
