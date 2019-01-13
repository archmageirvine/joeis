package irvine.oeis.a255;

import irvine.oeis.LinearRecurrence;

/**
 * A255840.
 * @author Sean A. Irvine
 */
public class A255840 extends LinearRecurrence {

  /** Construct the sequence. */
  public A255840() {
    super(new long[] {1, -2, 0, 2}, new long[] {0, 1, 4, 13});
  }
}
