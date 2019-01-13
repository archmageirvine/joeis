package irvine.oeis.a074;

import irvine.oeis.LinearRecurrence;

/**
 * A074377.
 * @author Sean A. Irvine
 */
public class A074377 extends LinearRecurrence {

  /** Construct the sequence. */
  public A074377() {
    super(new long[] {1, -1, -2, 2, 1}, new long[] {0, 1, 7, 10, 22});
  }
}
