package irvine.oeis.a042;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A042964 Numbers that are congruent to 2 or 3 mod 4.
 * @author Sean A. Irvine
 */
public class A042964 extends LinearRecurrence {

  /** Construct the sequence. */
  public A042964() {
    super(1, new long[] {-1, 1, 1}, new long[] {2, 3, 6});
  }
}
