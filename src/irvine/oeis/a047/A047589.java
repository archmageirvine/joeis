package irvine.oeis.a047;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A047589 Numbers that are congruent to {6, 7} mod 8.
 * @author Sean A. Irvine
 */
public class A047589 extends LinearRecurrence {

  /** Construct the sequence. */
  public A047589() {
    super(1, new long[] {-1, 1, 1}, new long[] {6, 7, 14});
  }
}
