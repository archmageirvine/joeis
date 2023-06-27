package irvine.oeis.a047;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A047227 Numbers that are congruent to {1, 2, 3, 4} mod 6.
 * @author Sean A. Irvine
 */
public class A047227 extends LinearRecurrence {

  /** Construct the sequence. */
  public A047227() {
    super(1, new long[] {-1, 1, 0, 0, 1}, new long[] {1, 2, 3, 4, 7});
  }
}
