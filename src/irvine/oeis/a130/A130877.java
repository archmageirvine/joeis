package irvine.oeis.a130;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A130877 Numbers that are congruent to {0, 5} mod 9.
 * @author Sean A. Irvine
 */
public class A130877 extends LinearRecurrence {

  /** Construct the sequence. */
  public A130877() {
    super(new long[] {-1, 1, 1}, new long[] {0, 5, 9});
  }
}
