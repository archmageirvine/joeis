package irvine.oeis.a256;

import irvine.oeis.LinearRecurrence;

/**
 * A256316 Number of partitions of <code>4n</code> into exactly 5 parts.
 * @author Sean A. Irvine
 */
public class A256316 extends LinearRecurrence {

  /** Construct the sequence. */
  public A256316() {
    super(new long[] {1, -3, 3, -2, 3, -4, 4, -3, 2, -3, 3}, new long[] {0, 0, 3, 13, 37, 84, 164, 291, 480, 748, 1115});
  }
}
