package irvine.oeis.a175;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A175885 Numbers that are congruent to {1, 10} mod 11.
 * @author Sean A. Irvine
 */
public class A175885 extends LinearRecurrence {

  /** Construct the sequence. */
  public A175885() {
    super(1, new long[] {-1, 1, 1}, new long[] {1, 10, 12});
  }
}
