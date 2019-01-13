package irvine.oeis.a157;

import irvine.oeis.LinearRecurrence;

/**
 * A157461.
 * @author Sean A. Irvine
 */
public class A157461 extends LinearRecurrence {

  /** Construct the sequence. */
  public A157461() {
    super(new long[] {-1, 26}, new long[] {1, 27});
  }
}
