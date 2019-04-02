package irvine.oeis.a047;

import irvine.oeis.LinearRecurrence;

/**
 * A047512 Numbers that are congruent to {1, 2, 4, 6, 7} mod 8.
 * @author Sean A. Irvine
 */
public class A047512 extends LinearRecurrence {

  /** Construct the sequence. */
  public A047512() {
    super(new long[] {-1, 1, 0, 0, 0, 1}, new long[] {1, 2, 4, 6, 7, 9});
  }
}
