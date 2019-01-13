package irvine.oeis.a232;

import irvine.oeis.LinearRecurrence;

/**
 * A232165.
 * @author Sean A. Irvine
 */
public class A232165 extends LinearRecurrence {

  /** Construct the sequence. */
  public A232165() {
    super(new long[] {1, 3, 1, 1}, new long[] {0, 1, 2, 3});
  }
}
