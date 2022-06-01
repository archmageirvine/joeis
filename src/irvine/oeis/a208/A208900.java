package irvine.oeis.a208;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A208900 Number of bitstrings of length n which (if having two or more runs) the last two runs have different lengths.
 * @author Sean A. Irvine
 */
public class A208900 extends LinearRecurrence {

  /** Construct the sequence. */
  public A208900() {
    super(new long[] {4, -6, 0, 3}, new long[] {2, 2, 6, 10});
  }
}
