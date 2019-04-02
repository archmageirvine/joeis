package irvine.oeis.a007;

import irvine.oeis.LinearRecurrence;

/**
 * A007715 Number of 5-leaf rooted trees with n levels.
 * @author Sean A. Irvine
 */
public class A007715 extends LinearRecurrence {

  /** Construct the sequence. */
  public A007715() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {1, 7, 27, 75, 170});
  }
}

