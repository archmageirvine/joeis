package irvine.oeis.a047;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A047353 Numbers that are congruent to {1, 2} mod 7.
 * @author Sean A. Irvine
 */
public class A047353 extends LinearRecurrence {

  /** Construct the sequence. */
  public A047353() {
    super(new long[] {-1, 1, 1}, new long[] {1, 2, 8});
  }
}
