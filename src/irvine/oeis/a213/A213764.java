package irvine.oeis.a213;

import irvine.oeis.LinearRecurrence;

/**
 * A213764.
 * @author Sean A. Irvine
 */
public class A213764 extends LinearRecurrence {

  /** Construct the sequence. */
  public A213764() {
    super(new long[] {-2, 7, -9, 5}, new long[] {1, 8, 31, 90});
  }
}
