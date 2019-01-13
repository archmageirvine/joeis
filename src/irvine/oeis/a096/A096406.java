package irvine.oeis.a096;

import irvine.oeis.LinearRecurrence;

/**
 * A096406.
 * @author Sean A. Irvine
 */
public class A096406 extends LinearRecurrence {

  /** Construct the sequence. */
  public A096406() {
    super(new long[] {2, 0, -1, 0}, new long[] {4, 0, 0, -4});
  }
}
