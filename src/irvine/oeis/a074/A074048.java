package irvine.oeis.a074;

import irvine.oeis.LinearRecurrence;

/**
 * A074048.
 * @author Sean A. Irvine
 */
public class A074048 extends LinearRecurrence {

  /** Construct the sequence. */
  public A074048() {
    super(new long[] {1, 1, 1, 1, 1}, new long[] {5, 1, 3, 7, 15});
  }
}
