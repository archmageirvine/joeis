package irvine.oeis.a208;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A208131 Partial products of A052901.
 * @author Sean A. Irvine
 */
public class A208131 extends LinearRecurrence {

  /** Construct the sequence. */
  public A208131() {
    super(new long[] {12, 0, 0}, new long[] {1, 3, 6});
  }
}
