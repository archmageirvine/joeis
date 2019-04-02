package irvine.oeis.a047;

import irvine.oeis.LinearRecurrence;

/**
 * A047546 Numbers that are congruent to {2, 3, 4, 7} mod 8.
 * @author Sean A. Irvine
 */
public class A047546 extends LinearRecurrence {

  /** Construct the sequence. */
  public A047546() {
    super(new long[] {-1, 2, -2, 2}, new long[] {2, 3, 4, 7});
  }
}
