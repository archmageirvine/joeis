package irvine.oeis.a081;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A081348 First row in maze arrangement of natural numbers.
 * @author Sean A. Irvine
 */
public class A081348 extends LinearRecurrence {

  /** Construct the sequence. */
  public A081348() {
    super(new long[] {1, -1, -2, 2, 1}, new long[] {1, 6, 7, 20, 21});
  }
}
