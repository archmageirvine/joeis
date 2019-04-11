package irvine.oeis.a256;

import irvine.oeis.LinearRecurrence;

/**
 * A256320 Number of partitions of <code>4n</code> into exactly 3 parts.
 * @author Sean A. Irvine
 */
public class A256320 extends LinearRecurrence {

  /** Construct the sequence. */
  public A256320() {
    super(new long[] {1, -2, 1, -1, 2}, new long[] {0, 1, 5, 12, 21});
  }
}
