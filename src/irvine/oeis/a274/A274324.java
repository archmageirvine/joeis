package irvine.oeis.a274;

import irvine.oeis.LinearRecurrence;

/**
 * A274324 Number of partitions of <code>n^3</code> into at most two parts.
 * @author Sean A. Irvine
 */
public class A274324 extends LinearRecurrence {

  /** Construct the sequence. */
  public A274324() {
    super(new long[] {-1, 3, -2, -2, 3}, new long[] {1, 1, 5, 14, 33});
  }
}
