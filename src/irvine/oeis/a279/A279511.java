package irvine.oeis.a279;

import irvine.oeis.LinearRecurrence;

/**
 * A279511.
 * @author Sean A. Irvine
 */
public class A279511 extends LinearRecurrence {

  /** Construct the sequence. */
  public A279511() {
    super(new long[] {10, -17, 8}, new long[] {5, 14, 55});
  }
}
