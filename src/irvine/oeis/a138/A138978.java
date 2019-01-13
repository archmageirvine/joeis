package irvine.oeis.a138;

import irvine.oeis.LinearRecurrence;

/**
 * A138978.
 * @author Sean A. Irvine
 */
public class A138978 extends LinearRecurrence {

  /** Construct the sequence. */
  public A138978() {
    super(new long[] {10, -31, 16}, new long[] {9, 121, 1665});
  }
}
