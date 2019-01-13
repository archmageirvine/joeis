package irvine.oeis.a213;

import irvine.oeis.LinearRecurrence;

/**
 * A213283.
 * @author Sean A. Irvine
 */
public class A213283 extends LinearRecurrence {

  /** Construct the sequence. */
  public A213283() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {0, 1, 9, 36, 118});
  }
}
