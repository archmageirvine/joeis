package irvine.oeis.a164;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A164055 Triangular numbers that are one plus a perfect square.
 * @author Sean A. Irvine
 */
public class A164055 extends LinearRecurrence {

  /** Construct the sequence. */
  public A164055() {
    super(new long[] {1, -35, 35}, new long[] {1, 10, 325});
  }
}
