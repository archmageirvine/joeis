package irvine.oeis.a256;

import irvine.oeis.LinearRecurrence;

/**
 * A256327 Number of partitions of <code>5n</code> into exactly 4 parts.
 * @author Sean A. Irvine
 */
public class A256327 extends LinearRecurrence {

  /** Construct the sequence. */
  public A256327() {
    super(new long[] {-1, 1, 1, 0, 0, -2, 0, 0, 1, 1}, new long[] {0, 1, 9, 27, 64, 120, 206, 321, 478, 672});
  }
}
