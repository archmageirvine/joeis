package irvine.oeis.a029;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A029739 Numbers that are congruent to {1, 3, 4} mod 6.
 * @author Sean A. Irvine
 */
public class A029739 extends LinearRecurrence {

  /** Construct the sequence. */
  public A029739() {
    super(1, new long[] {-1, 1, 0, 1}, new long[] {1, 3, 4, 7});
  }
}
