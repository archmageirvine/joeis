package irvine.oeis.a157;

import irvine.oeis.LinearRecurrence;

/**
 * A157665.
 * @author Sean A. Irvine
 */
public class A157665 extends LinearRecurrence {

  /** Construct the sequence. */
  public A157665() {
    super(new long[] {1, -3, 3}, new long[] {67, 1238, 3867});
  }
}
