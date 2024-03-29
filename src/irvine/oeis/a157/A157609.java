package irvine.oeis.a157;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A157609 2662n - 22.
 * @author Sean A. Irvine
 */
public class A157609 extends LinearRecurrence {

  /** Construct the sequence. */
  public A157609() {
    super(1, new long[] {-1, 2}, new long[] {2640, 5302});
  }
}
