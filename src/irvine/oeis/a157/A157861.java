package irvine.oeis.a157;

import irvine.oeis.LinearRecurrence;

/**
 * A157861.
 * @author Sean A. Irvine
 */
public class A157861 extends LinearRecurrence {

  /** Construct the sequence. */
  public A157861() {
    super(new long[] {1, -3, 3}, new long[] {3601, 14402, 32403});
  }
}
