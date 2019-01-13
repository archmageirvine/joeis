package irvine.oeis.a069;

import irvine.oeis.LinearRecurrence;

/**
 * A069006.
 * @author Sean A. Irvine
 */
public class A069006 extends LinearRecurrence {

  /** Construct the sequence. */
  public A069006() {
    super(new long[] {1, -1, -4, 3, 3}, new long[] {1, 2, 9, 29, 105});
  }
}
