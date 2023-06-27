package irvine.oeis.a160;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A160873 Number of isomorphism classes of connected (D_4)-fold coverings of a connected graph with circuit rank n.
 * @author Sean A. Irvine
 */
public class A160873 extends LinearRecurrence {

  /** Construct the sequence. */
  public A160873() {
    super(1, new long[] {64, -56, 14}, new long[] {0, 3, 42});
  }
}
