package irvine.oeis.a213;

import irvine.oeis.LinearRecurrence;

/**
 * A213396.
 * @author Sean A. Irvine
 */
public class A213396 extends LinearRecurrence {

  /** Construct the sequence. */
  public A213396() {
    super(new long[] {-1, 3, -3, 2, -3, 3}, new long[] {0, 3, 9, 21, 42, 72});
  }
}
