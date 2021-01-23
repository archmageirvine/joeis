package irvine.oeis.a174;

import irvine.oeis.LinearRecurrence;

/**
 * A174257 Number of symmetry classes of 3 X 3 reduced magic squares with distinct values and maximum value 2n; also, with magic sum 3n.
 * @author Sean A. Irvine
 */
public class A174257 extends LinearRecurrence {

  /** Construct the sequence. */
  public A174257() {
    super(new long[] {-1, 0, 1, 1, 0}, new long[] {0, 0, 0, 1, 2});
  }
}
