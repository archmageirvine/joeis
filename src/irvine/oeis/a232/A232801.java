package irvine.oeis.a232;

import irvine.oeis.LinearRecurrence;

/**
 * A232801.
 * @author Sean A. Irvine
 */
public class A232801 extends LinearRecurrence {

  /** Construct the sequence. */
  public A232801() {
    super(new long[] {-3, 0, 4, 0}, new long[] {0, 1, 1, 3});
  }
}
