package irvine.oeis.a175;

import irvine.oeis.LinearRecurrence;

/**
 * A175658.
 * @author Sean A. Irvine
 */
public class A175658 extends LinearRecurrence {

  /** Construct the sequence. */
  public A175658() {
    super(new long[] {-2, -3, 4}, new long[] {1, 4, 10});
  }
}
