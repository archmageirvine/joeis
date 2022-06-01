package irvine.oeis.a255;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A255371 Number of strings of n decimal digits that contain at least one "0" digit that is not part of a string of two or more consecutive "0" digits.
 * @author Sean A. Irvine
 */
public class A255371 extends LinearRecurrence {

  /** Construct the sequence. */
  public A255371() {
    super(new long[] {-90, 99, -109, 20}, new long[] {0, 1, 18, 252});
  }
}
