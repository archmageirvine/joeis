package irvine.oeis.a213;

import irvine.oeis.LinearRecurrence;

/**
 * A213046.
 * @author Sean A. Irvine
 */
public class A213046 extends LinearRecurrence {

  /** Construct the sequence. */
  public A213046() {
    super(new long[] {1, 0, -3, 1, 2}, new long[] {2, 3, 8, 13, 25});
  }
}
