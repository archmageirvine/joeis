package irvine.oeis.a017;

import irvine.oeis.LinearRecurrence;

/**
 * A017825.
 * @author Sean A. Irvine
 */
public class A017825 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017825() {
    super(new long[] {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0}, new long[] {1, 0, 0, 1, 1, 1, 2, 3, 4, 6, 9, 13});
  }
}
