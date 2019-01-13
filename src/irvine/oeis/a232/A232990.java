package irvine.oeis.a232;

import irvine.oeis.LinearRecurrence;

/**
 * A232990.
 * @author Sean A. Irvine
 */
public class A232990 extends LinearRecurrence {

  /** Construct the sequence. */
  public A232990() {
    super(new long[] {1, 0, 0, 0, 0}, new long[] {1, 0, 0, 1, 0});
  }
}
