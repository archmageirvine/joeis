package irvine.oeis.a096;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A096975 Trace sequence of a path graph plus loop.
 * @author Sean A. Irvine
 */
public class A096975 extends LinearRecurrence {

  /** Construct the sequence. */
  public A096975() {
    super(new long[] {-1, 2, 1}, new long[] {3, 1, 5});
  }
}
