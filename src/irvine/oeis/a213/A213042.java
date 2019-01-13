package irvine.oeis.a213;

import irvine.oeis.LinearRecurrence;

/**
 * A213042.
 * @author Sean A. Irvine
 */
public class A213042 extends LinearRecurrence {

  /** Construct the sequence. */
  public A213042() {
    super(new long[] {-1, 0, 2, 2, -1, -4, -1, 2, 2, 0}, new long[] {1, 0, 2, 2, 3, 4, 7, 6, 11, 12});
  }
}
