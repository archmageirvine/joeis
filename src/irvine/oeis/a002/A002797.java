package irvine.oeis.a002;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A002797 Number of solutions to a linear inequality.
 * @author Sean A. Irvine
 */
public class A002797 extends LinearRecurrence {

  /** Construct the sequence. */
  public A002797() {
    super(new long[] {1, -1, -1, 1, -1, 1, 1}, new long[] {3, 2, 5, 9, 17, 27, 40});
  }
}
