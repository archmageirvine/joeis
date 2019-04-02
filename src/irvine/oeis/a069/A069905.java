package irvine.oeis.a069;

import irvine.oeis.LinearRecurrence;

/**
 * A069905 Number of partitions of n into 3 positive parts.
 * @author Sean A. Irvine
 */
public class A069905 extends LinearRecurrence {

  /** Construct the sequence. */
  public A069905() {
    super(new long[] {1, -1, -1, 0, 1, 1}, new long[] {0, 0, 0, 1, 1, 2});
  }
}
