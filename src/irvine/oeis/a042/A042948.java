package irvine.oeis.a042;

import irvine.oeis.LinearRecurrence;

/**
 * A042948 Numbers congruent to 0 or 1 mod 4.
 * @author Sean A. Irvine
 */
public class A042948 extends LinearRecurrence {

  /** Construct the sequence. */
  public A042948() {
    super(new long[] {-1, 1, 1}, new long[] {0, 1, 4});
  }
}
