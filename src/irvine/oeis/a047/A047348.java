package irvine.oeis.a047;

import irvine.oeis.LinearRecurrence;

/**
 * A047348 Numbers that are congruent to {2, 4} mod 7.
 * @author Sean A. Irvine
 */
public class A047348 extends LinearRecurrence {

  /** Construct the sequence. */
  public A047348() {
    super(new long[] {-1, 1, 1}, new long[] {2, 4, 9});
  }
}
