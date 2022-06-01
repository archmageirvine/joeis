package irvine.oeis.a259;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A259751 Numbers that are congruent to {8, 16} mod 24.
 * @author Sean A. Irvine
 */
public class A259751 extends LinearRecurrence {

  /** Construct the sequence. */
  public A259751() {
    super(new long[] {-1, 1, 1}, new long[] {8, 16, 32});
  }
}
