package irvine.oeis.a012;

import irvine.oeis.LinearRecurrence;

/**
 * A012866.
 * @author Sean A. Irvine
 */
public class A012866 extends LinearRecurrence {

  /** Construct the sequence. */
  public A012866() {
    super(new long[] {1, -4, 5}, new long[] {0, 1, 2});
  }
}
