package irvine.oeis.a102;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A102526 Duplicate of A001224.
 * @author Sean A. Irvine
 */
public class A102526 extends LinearRecurrence {

  /** Construct the sequence. */
  public A102526() {
    super(new long[] {-1, -1, 0, -1, 2, 1}, new long[] {1, 1, 2, 2, 4, 5});
  }
}
