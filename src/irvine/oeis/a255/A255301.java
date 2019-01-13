package irvine.oeis.a255;

import irvine.oeis.LinearRecurrence;

/**
 * A255301.
 * @author Sean A. Irvine
 */
public class A255301 extends LinearRecurrence {

  /** Construct the sequence. */
  public A255301() {
    super(new long[] {-4, -2, -1, 4}, new long[] {1, 4, 16, 56});
  }
}
