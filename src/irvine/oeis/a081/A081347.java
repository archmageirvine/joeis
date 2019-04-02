package irvine.oeis.a081;

import irvine.oeis.LinearRecurrence;

/**
 * A081347 First column in maze arrangement of natural numbers.
 * @author Sean A. Irvine
 */
public class A081347 extends LinearRecurrence {

  /** Construct the sequence. */
  public A081347() {
    super(new long[] {1, -1, -2, 2, 1}, new long[] {1, 2, 3, 12, 13});
  }
}
