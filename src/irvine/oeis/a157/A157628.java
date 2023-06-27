package irvine.oeis.a157;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A157628 80000n^2 - 120800n + 45601.
 * @author Sean A. Irvine
 */
public class A157628 extends LinearRecurrence {

  /** Construct the sequence. */
  public A157628() {
    super(1, new long[] {1, -3, 3}, new long[] {4801, 124001, 403201});
  }
}
