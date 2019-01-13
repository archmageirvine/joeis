package irvine.oeis.a157;

import irvine.oeis.LinearRecurrence;

/**
 * A157730.
 * @author Sean A. Irvine
 */
public class A157730 extends LinearRecurrence {

  /** Construct the sequence. */
  public A157730() {
    super(new long[] {1, -3, 3}, new long[] {88, 923, 2640});
  }
}
