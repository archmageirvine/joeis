package irvine.oeis.a061;

import irvine.oeis.LinearRecurrence;

/**
 * A061551 Number of paths along a corridor width <code>8,</code> starting from one side.
 * @author Sean A. Irvine
 */
public class A061551 extends LinearRecurrence {

  /** Construct the sequence. */
  public A061551() {
    super(new long[] {-1, -2, 3, 1}, new long[] {1, 1, 2, 3});
  }
}
