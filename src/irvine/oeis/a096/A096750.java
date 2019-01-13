package irvine.oeis.a096;

import irvine.oeis.LinearRecurrence;

/**
 * A096750.
 * @author Sean A. Irvine
 */
public class A096750 extends LinearRecurrence {

  /** Construct the sequence. */
  public A096750() {
    super(new long[] {1, 1, -2, 2}, new long[] {1, 1, 1, 1});
  }
}
