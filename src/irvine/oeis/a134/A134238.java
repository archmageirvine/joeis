package irvine.oeis.a134;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A134238 Row sums of triangle A134237.
 * @author Sean A. Irvine
 */
public class A134238 extends LinearRecurrence {

  /** Construct the sequence. */
  public A134238() {
    super(1, new long[] {1, -3, 3}, new long[] {1, 5, 14});
  }
}
