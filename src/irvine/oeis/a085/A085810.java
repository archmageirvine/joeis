package irvine.oeis.a085;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A085810 Number of three-choice paths along a corridor of height 5, starting from the lower side.
 * @author Sean A. Irvine
 */
public class A085810 extends LinearRecurrence {

  /** Construct the sequence. */
  public A085810() {
    super(new long[] {-1, -3, 4}, new long[] {1, 2, 5});
  }
}
