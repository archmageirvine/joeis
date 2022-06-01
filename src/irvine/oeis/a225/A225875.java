package irvine.oeis.a225;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A225875 We write the 1 + 4*k numbers once and twice the others.
 * @author Sean A. Irvine
 */
public class A225875 extends LinearRecurrence {

  /** Construct the sequence. */
  public A225875() {
    super(new long[] {-1, 1, 0, 0, 0, 0, 0, 1}, new long[] {1, 2, 2, 3, 3, 4, 4, 5});
  }
}
