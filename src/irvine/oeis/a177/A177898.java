package irvine.oeis.a177;

import irvine.oeis.LinearRecurrence;

/**
 * A177898.
 * @author Sean A. Irvine
 */
public class A177898 extends LinearRecurrence {

  /** Construct the sequence. */
  public A177898() {
    super(new long[] {-1, 1, 1}, new long[] {1, 6, 4});
  }
}
