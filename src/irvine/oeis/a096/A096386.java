package irvine.oeis.a096;

import irvine.oeis.LinearRecurrence;

/**
 * A096386.
 * @author Sean A. Irvine
 */
public class A096386 extends LinearRecurrence {

  /** Construct the sequence. */
  public A096386() {
    super(new long[] {-1, 1, 0, 0, 0, 0, 1}, new long[] {0, 0, 1, 2, 3, 3, 4});
  }
}
