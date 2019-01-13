package irvine.oeis.a050;

import irvine.oeis.LinearRecurrence;

/**
 * A050271.
 * @author Sean A. Irvine
 */
public class A050271 extends LinearRecurrence {

  /** Construct the sequence. */
  public A050271() {
    super(new long[] {1, -1, 0, -2, 2, 0, 1}, new long[] {1, 2, 3, 4, 7, 8, 9});
  }
}
