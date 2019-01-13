package irvine.oeis.a213;

import irvine.oeis.LinearRecurrence;

/**
 * A213483.
 * @author Sean A. Irvine
 */
public class A213483 extends LinearRecurrence {

  /** Construct the sequence. */
  public A213483() {
    super(new long[] {-1, 2, 1, -4, 1, 2}, new long[] {1, 5, 13, 23, 38, 55});
  }
}
