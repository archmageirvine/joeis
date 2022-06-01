package irvine.oeis.a256;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A256225 Number of partitions of 5n into 5 parts.
 * @author Sean A. Irvine
 */
public class A256225 extends LinearRecurrence {

  /** Construct the sequence. */
  public A256225() {
    super(new long[] {1, -2, 0, 1, 0, 2, -2, 0, -1, 0, 2}, new long[] {0, 1, 7, 30, 84, 192, 377, 674, 1115, 1747, 2611});
  }
}
