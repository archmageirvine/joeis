package irvine.oeis.a256;

import irvine.oeis.LinearRecurrence;

/**
 * A256315 Number of partitions of <code>3n</code> into exactly 6 parts.
 * @author Sean A. Irvine
 */
public class A256315 extends LinearRecurrence {

  /** Construct the sequence. */
  public A256315() {
    super(new long[] {-1, 2, 1, -4, 2, 1, -4, 3, 3, -4, 1, 2, -4, 1, 2}, new long[] {0, 0, 1, 3, 11, 26, 58, 110, 199, 331, 532, 811, 1206, 1729, 2432});
  }
}
