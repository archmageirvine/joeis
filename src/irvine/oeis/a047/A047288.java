package irvine.oeis.a047;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A047288 Numbers that are congruent to {4, 6} mod 7.
 * @author Sean A. Irvine
 */
public class A047288 extends LinearRecurrence {

  /** Construct the sequence. */
  public A047288() {
    super(1, new long[] {-1, 1, 1}, new long[] {4, 6, 11});
  }
}
