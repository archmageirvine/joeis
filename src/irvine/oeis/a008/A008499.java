package irvine.oeis.a008;

import irvine.oeis.LinearRecurrence;

/**
 * A008499 Number of 5-dimensional centered tetrahedral numbers.
 * @author Sean A. Irvine
 */
public class A008499 extends LinearRecurrence {

  /** Construct the sequence. */
  public A008499() {
    super(new long[] {-1, 6, -15, 20, -15, 6}, new long[] {1, 7, 28, 84, 210, 462});
  }
}

