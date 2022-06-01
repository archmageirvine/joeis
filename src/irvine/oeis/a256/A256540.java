package irvine.oeis.a256;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A256540 Number of partitions of 4n into at most 6 parts.
 * @author Sean A. Irvine
 */
public class A256540 extends LinearRecurrence {

  /** Construct the sequence. */
  public A256540() {
    super(new long[] {-1, 3, -3, 3, -6, 7, -6, 6, -6, 7, -6, 3, -3, 3}, new long[] {1, 5, 20, 58, 136, 282, 532, 931, 1540, 2432, 3692, 5427, 7760, 10829});
  }
}
