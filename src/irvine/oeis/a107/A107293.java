package irvine.oeis.a107;

import irvine.oeis.LinearRecurrence;

/**
 * A107293.
 * @author Sean A. Irvine
 */
public class A107293 extends LinearRecurrence {

  /** Construct the sequence. */
  public A107293() {
    super(new long[] {1, 0, -1, 1, 1}, new long[] {0, 0, 0, 0, 1});
  }
}
