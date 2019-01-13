package irvine.oeis.a008;

import irvine.oeis.LinearRecurrence;

/**
 * A008498.
 * @author Sean A. Irvine
 */
public class A008498 extends LinearRecurrence {

  /** Construct the sequence. */
  public A008498() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {1, 6, 21, 56, 126});
  }
}

