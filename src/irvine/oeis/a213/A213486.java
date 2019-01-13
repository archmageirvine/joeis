package irvine.oeis.a213;

import irvine.oeis.LinearRecurrence;

/**
 * A213486.
 * @author Sean A. Irvine
 */
public class A213486 extends LinearRecurrence {

  /** Construct the sequence. */
  public A213486() {
    super(new long[] {-1, 4, -7, 8, -7, 4}, new long[] {0, 3, 12, 27, 48, 78});
  }
}
