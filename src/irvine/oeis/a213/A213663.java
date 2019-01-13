package irvine.oeis.a213;

import irvine.oeis.LinearRecurrence;

/**
 * A213663.
 * @author Sean A. Irvine
 */
public class A213663 extends LinearRecurrence {

  /** Construct the sequence. */
  public A213663() {
    super(new long[] {-2, -1, -1, 3}, new long[] {7, 13, 25, 49});
  }
}
