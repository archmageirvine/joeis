package irvine.oeis.a160;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A160682 The list of the A values in the common solutions to 13*k+1 = A^2 and 17*k+1 = B^2.
 * @author Sean A. Irvine
 */
public class A160682 extends LinearRecurrence {

  /** Construct the sequence. */
  public A160682() {
    super(1, new long[] {-1, 15}, new long[] {1, 14});
  }
}
