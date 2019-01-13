package irvine.oeis.a096;

import irvine.oeis.LinearRecurrence;

/**
 * A096320.
 * @author Sean A. Irvine
 */
public class A096320 extends LinearRecurrence {

  /** Construct the sequence. */
  public A096320() {
    super(new long[] {1, 0, 0, 0, 0, -1, 0, 0, 0, 0, 1, 0, 0, 0, 0}, new long[] {2, 3, 5, 8, 2, 7, 3, 0, 8, 7, 7, 8, 0, 3, 7});
  }
}
