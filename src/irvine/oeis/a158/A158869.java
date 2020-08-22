package irvine.oeis.a158;

import irvine.oeis.LinearRecurrence;

/**
 * A158869 Number of ways of filling a 2 X 3 X 2n hole with 1 X 2 X 2 bricks.
 * @author Sean A. Irvine
 */
public class A158869 extends LinearRecurrence {

  /** Construct the sequence. */
  public A158869() {
    super(new long[] {-3, 6}, new long[] {1, 5});
  }
}
