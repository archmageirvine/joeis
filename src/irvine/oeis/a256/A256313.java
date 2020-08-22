package irvine.oeis.a256;

import irvine.oeis.LinearRecurrence;

/**
 * A256313 Number of partitions of 3n into exactly 4 parts.
 * @author Sean A. Irvine
 */
public class A256313 extends LinearRecurrence {

  /** Construct the sequence. */
  public A256313() {
    super(new long[] {-1, 2, 0, -2, 2, -2, 0, 2}, new long[] {0, 0, 2, 6, 15, 27, 47, 72});
  }
}
