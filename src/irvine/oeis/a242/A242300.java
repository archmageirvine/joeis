package irvine.oeis.a242;

import irvine.oeis.LinearRecurrence;

/**
 * A242300.
 * @author Sean A. Irvine
 */
public class A242300 extends LinearRecurrence {

  /** Construct the sequence. */
  public A242300() {
    super(new long[] {-1, 2, 4, -6, -2, 4}, new long[] {0, 2, 11, 35, 105, 292});
  }
}
