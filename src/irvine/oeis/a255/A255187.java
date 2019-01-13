package irvine.oeis.a255;

import irvine.oeis.LinearRecurrence;

/**
 * A255187.
 * @author Sean A. Irvine
 */
public class A255187 extends LinearRecurrence {

  /** Construct the sequence. */
  public A255187() {
    super(new long[] {1, -3, 3}, new long[] {0, 1, 29});
  }
}
