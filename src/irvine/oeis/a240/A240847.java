package irvine.oeis.a240;

import irvine.oeis.LinearRecurrence;

/**
 * A240847.
 * @author Sean A. Irvine
 */
public class A240847 extends LinearRecurrence {

  /** Construct the sequence. */
  public A240847() {
    super(new long[] {-1, -2, 1, 2}, new long[] {0, 0, 1, 0});
  }
}
