package irvine.oeis.a225;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A225839 Triangular numbers representable as triangular(m) + triangular(2m).
 * @author Sean A. Irvine
 */
public class A225839 extends LinearRecurrence {

  /** Construct the sequence. */
  public A225839() {
    super(1, new long[] {1, -1, -103682, 103682, 1}, new long[] {0, 378, 17766, 39209940, 1842032556});
  }
}
