package irvine.oeis.a160;

import irvine.oeis.LinearRecurrence;

/**
 * A160682 The list of the A values in the common solutions to <code>13*k+1 = A^2</code> and <code>17*k+1 = B^2</code>.
 * @author Sean A. Irvine
 */
public class A160682 extends LinearRecurrence {

  /** Construct the sequence. */
  public A160682() {
    super(new long[] {-1, 15}, new long[] {1, 14});
  }
}
