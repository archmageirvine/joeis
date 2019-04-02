package irvine.oeis.a253;

import irvine.oeis.LinearRecurrence;

/**
 * A253412 Number of n-bit legal binary words with maximal set of 1s.
 * @author Sean A. Irvine
 */
public class A253412 extends LinearRecurrence {

  /** Construct the sequence. */
  public A253412() {
    super(new long[] {-1, 0, 1, 1, 1, 0}, new long[] {1, 2, 2, 4, 4, 7});
  }
}
