package irvine.oeis.a042;

import irvine.oeis.LinearRecurrence;

/**
 * A042965 Nonnegative integers not congruent to 2 mod 4.
 * @author Sean A. Irvine
 */
public class A042965 extends LinearRecurrence {

  /** Construct the sequence. */
  public A042965() {
    super(new long[] {-1, 1, 0, 1}, new long[] {0, 1, 3, 4});
  }
}
