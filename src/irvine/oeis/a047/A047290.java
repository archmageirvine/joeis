package irvine.oeis.a047;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A047290 Numbers that are congruent to {1, 4, 6} mod 7.
 * @author Sean A. Irvine
 */
public class A047290 extends LinearRecurrence {

  /** Construct the sequence. */
  public A047290() {
    super(1, new long[] {-1, 1, 0, 1}, new long[] {1, 4, 6, 8});
  }
}
