package irvine.oeis.a256;

import irvine.oeis.LinearRecurrence;

/**
 * A256539 Number of partitions of <code>4n</code> into at most 5 parts.
 * @author Sean A. Irvine
 */
public class A256539 extends LinearRecurrence {

  /** Construct the sequence. */
  public A256539() {
    super(new long[] {1, -3, 3, -2, 3, -4, 4, -3, 2, -3, 3}, new long[] {1, 5, 18, 47, 101, 192, 333, 540, 831, 1226, 1747});
  }
}
