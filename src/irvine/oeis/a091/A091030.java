package irvine.oeis.a091;

import irvine.oeis.LinearRecurrence;

/**
 * A091030 Partial sums of powers of 13 (A001022).
 * @author Sean A. Irvine
 */
public class A091030 extends LinearRecurrence {

  /** Construct the sequence. */
  public A091030() {
    super(new long[] {-13, 14}, new long[] {1, 14});
  }
}
