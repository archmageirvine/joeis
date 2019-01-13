package irvine.oeis.a183;

import irvine.oeis.LinearRecurrence;

/**
 * A183575.
 * @author Sean A. Irvine
 */
public class A183575 extends LinearRecurrence {

  /** Construct the sequence. */
  public A183575() {
    super(new long[] {1, -2, 0, 2}, new long[] {2, 6, 10, 16});
  }
}
