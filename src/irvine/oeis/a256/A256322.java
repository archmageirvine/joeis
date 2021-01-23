package irvine.oeis.a256;

import irvine.oeis.LinearRecurrence;

/**
 * A256322 Number of partitions of 7n into exactly 3 parts.
 * @author Sean A. Irvine
 */
public class A256322 extends LinearRecurrence {

  /** Construct the sequence. */
  public A256322() {
    super(new long[] {1, -1, -1, 0, 1, 1}, new long[] {0, 4, 16, 37, 65, 102});
  }
}
