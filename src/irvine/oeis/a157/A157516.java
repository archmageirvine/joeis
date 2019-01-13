package irvine.oeis.a157;

import irvine.oeis.LinearRecurrence;

/**
 * A157516.
 * @author Sean A. Irvine
 */
public class A157516 extends LinearRecurrence {

  /** Construct the sequence. */
  public A157516() {
    super(new long[] {1, -3, 3}, new long[] {4801, 19601, 44401});
  }
}
