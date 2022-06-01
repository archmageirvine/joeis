package irvine.oeis.a157;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A157716 One-eighth of triangular numbers (integers only).
 * @author Sean A. Irvine
 */
public class A157716 extends LinearRecurrence {

  /** Construct the sequence. */
  public A157716() {
    super(new long[] {1, -1, -2, 2, 1}, new long[] {0, 15, 17, 62, 66});
  }
}
