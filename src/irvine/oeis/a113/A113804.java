package irvine.oeis.a113;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A113804 Numbers that are congruent to 4 or 10 mod 14.
 * @author Sean A. Irvine
 */
public class A113804 extends LinearRecurrence {

  /** Construct the sequence. */
  public A113804() {
    super(1, new long[] {-1, 1, 1}, new long[] {4, 10, 18});
  }
}
