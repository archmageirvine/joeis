package irvine.oeis.a158;

import irvine.oeis.LinearRecurrence;

/**
 * A158479 36n^2 + 6.
 * @author Sean A. Irvine
 */
public class A158479 extends LinearRecurrence {

  /** Construct the sequence. */
  public A158479() {
    super(new long[] {1, -3, 3}, new long[] {42, 150, 330});
  }
}
