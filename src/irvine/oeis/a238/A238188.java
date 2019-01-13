package irvine.oeis.a238;

import irvine.oeis.LinearRecurrence;

/**
 * A238188.
 * @author Sean A. Irvine
 */
public class A238188 extends LinearRecurrence {

  /** Construct the sequence. */
  public A238188() {
    super(new long[] {1, 0, 0, 0, 4, 0, 0, 0, 6, 0, 0, 0, 4, 0, 0, 0}, new long[] {0, 0, 1, 1, 2, 2, 2, 3, 9, 11, 13, 15, 48, 57, 68, 81});
  }
}
