package irvine.oeis.a047;

import irvine.oeis.LinearRecurrence;

/**
 * A047261 Numbers that are congruent to <code>{2, 4, 5} mod 6</code>.
 * @author Sean A. Irvine
 */
public class A047261 extends LinearRecurrence {

  /** Construct the sequence. */
  public A047261() {
    super(new long[] {-1, 1, 0, 1}, new long[] {2, 4, 5, 8});
  }
}
