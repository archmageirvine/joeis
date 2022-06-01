package irvine.oeis.a008;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A008505 11-dimensional centered tetrahedral numbers.
 * @author Sean A. Irvine
 */
public class A008505 extends LinearRecurrence {

  /** Construct the sequence. */
  public A008505() {
    super(new long[] {-1, 12, -66, 220, -495, 792, -924, 792, -495, 220, -66, 12},
      new long[] {1, 13, 91, 455, 1820, 6188, 18564, 50388, 125970, 293930, 646646, 1352078});
  }
}

