package irvine.oeis.a173;

import irvine.oeis.LinearRecurrence;

/**
 * A173391.
 * @author Sean A. Irvine
 */
public class A173391 extends LinearRecurrence {

  /** Construct the sequence. */
  public A173391() {
    super(new long[] {3, -7, 5}, new long[] {9, 21, 45});
  }
}
