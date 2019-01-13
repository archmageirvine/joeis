package irvine.oeis.a096;

import irvine.oeis.LinearRecurrence;

/**
 * A096957.
 * @author Sean A. Irvine
 */
public class A096957 extends LinearRecurrence {

  /** Construct the sequence. */
  public A096957() {
    super(new long[] {-1, 4, -6, 4}, new long[] {6, 19, 40, 70});
  }
}
