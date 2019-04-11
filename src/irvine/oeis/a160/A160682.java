package irvine.oeis.a160;

import irvine.oeis.LinearRecurrence;

/**
 * A160682 The list of the A values in the common solutions to <code>13*k+1 =</code> A^2 and <code>17*k+1 =</code> B^2.
 * @author Sean A. Irvine
 */
public class A160682 extends LinearRecurrence {

  /** Construct the sequence. */
  public A160682() {
    super(new long[] {-1, 15}, new long[] {1, 14});
  }
}
