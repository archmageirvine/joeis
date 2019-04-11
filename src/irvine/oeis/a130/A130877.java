package irvine.oeis.a130;

import irvine.oeis.LinearRecurrence;

/**
 * A130877 Numbers that are congruent to <code>{0, 5} mod 9</code>.
 * @author Sean A. Irvine
 */
public class A130877 extends LinearRecurrence {

  /** Construct the sequence. */
  public A130877() {
    super(new long[] {-1, 1, 1}, new long[] {0, 5, 9});
  }
}
