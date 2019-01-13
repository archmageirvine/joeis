package irvine.oeis.a193;

import irvine.oeis.LinearRecurrence;

/**
 * A193866.
 * @author Sean A. Irvine
 */
public class A193866 extends LinearRecurrence {

  /** Construct the sequence. */
  public A193866() {
    super(new long[] {1, -1, -2, 2, 1}, new long[] {0, 6, 11, 35, 46});
  }
}
