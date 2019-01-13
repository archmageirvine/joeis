package irvine.oeis.a291;

import irvine.oeis.LinearRecurrence;

/**
 * A291396.
 * @author Sean A. Irvine
 */
public class A291396 extends LinearRecurrence {

  /** Construct the sequence. */
  public A291396() {
    super(new long[] {6, 18, 7, -16, -5, 6}, new long[] {6, 31, 140, 596, 2440, 9751});
  }
}
