package irvine.oeis.a045;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A045572 Numbers that are odd but not divisible by 5.
 * @author Sean A. Irvine
 */
public class A045572 extends LinearRecurrence {

  /** Construct the sequence. */
  public A045572() {
    super(1, new long[] {-1, 1, 0, 0, 1}, new long[] {1, 3, 7, 9, 11});
  }
}
