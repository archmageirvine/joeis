package irvine.oeis.a007;

import irvine.oeis.LinearRecurrence;

/**
 * A007389.
 * @author Sean A. Irvine
 */
public class A007389 extends LinearRecurrence {

  /** Construct the sequence. */
  public A007389() {
    super(new long[] {0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 1, 0},
      new long[] {0, 2, 3, 2, 5, 2, 7, 2, 9, 2, 11, 2, 13, 2, 15, 2});
  }
}

