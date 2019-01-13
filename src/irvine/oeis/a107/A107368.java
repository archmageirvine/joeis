package irvine.oeis.a107;

import irvine.oeis.LinearRecurrence;

/**
 * A107368.
 * @author Sean A. Irvine
 */
public class A107368 extends LinearRecurrence {

  /** Construct the sequence. */
  public A107368() {
    super(new long[] {1, 0, -1, 1, 1}, new long[] {0, 0, 1, 0, 1});
  }
}
