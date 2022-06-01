package irvine.oeis.a238;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A238340 Number of partitions of 4n into 4 parts.
 * @author Sean A. Irvine
 */
public class A238340 extends LinearRecurrence {

  /** Construct the sequence. */
  public A238340() {
    super(new long[] {-1, 3, -3, 2, -3, 3}, new long[] {1, 5, 15, 34, 64, 108});
  }
}
