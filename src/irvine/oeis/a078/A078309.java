package irvine.oeis.a078;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A078309 Numbers that are congruent to {1, 4, 7} mod 10.
 * @author Sean A. Irvine
 */
public class A078309 extends LinearRecurrence {

  /** Construct the sequence. */
  public A078309() {
    super(new long[] {-1, 1, 0, 1}, new long[] {1, 4, 7, 11});
  }
}
