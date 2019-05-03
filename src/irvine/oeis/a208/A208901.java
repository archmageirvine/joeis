package irvine.oeis.a208;

import irvine.oeis.LinearRecurrence;

/**
 * A208901 Number of bitstrings of length <code>n</code> (with at least two runs) where the last two runs have different lengths.
 * @author Sean A. Irvine
 */
public class A208901 extends LinearRecurrence {

  /** Construct the sequence. */
  public A208901() {
    super(new long[] {-4, 2, 2}, new long[] {0, 0, 4});
  }
}
