package irvine.oeis.a069;

import irvine.oeis.LinearRecurrence;

/**
 * A069813.
 * @author Sean A. Irvine
 */
public class A069813 extends LinearRecurrence {

  /** Construct the sequence. */
  public A069813() {
    super(new long[] {1, -1, -1, 0, 1, 1}, new long[] {1, 2, 3, 6, 7, 10});
  }
}
