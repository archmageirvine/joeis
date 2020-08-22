package irvine.oeis.a047;

import irvine.oeis.LinearRecurrence;

/**
 * A047528 Numbers that are congruent to {0, 3, 7} mod 8.
 * @author Sean A. Irvine
 */
public class A047528 extends LinearRecurrence {

  /** Construct the sequence. */
  public A047528() {
    super(new long[] {-1, 1, 0, 1}, new long[] {0, 3, 7, 8});
  }
}
