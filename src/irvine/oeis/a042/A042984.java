package irvine.oeis.a042;

import irvine.oeis.LinearRecurrence;

/**
 * A042984 Number of n-dimensional partitions of 6.
 * @author Sean A. Irvine
 */
public class A042984 extends LinearRecurrence {

  /** Construct the sequence. */
  public A042984() {
    super(new long[] {-1, 6, -15, 20, -15, 6}, new long[] {1, 11, 48, 140, 326, 657});
  }
}
