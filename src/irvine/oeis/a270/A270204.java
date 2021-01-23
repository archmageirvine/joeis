package irvine.oeis.a270;

import irvine.oeis.LinearRecurrence;

/**
 * A270204 a(n) = n^12 - n^10 + n^8 - n^6 + n^4 - n^2 + 1.
 * @author Sean A. Irvine
 */
public class A270204 extends LinearRecurrence {

  /** Construct the sequence. */
  public A270204() {
    super(new long[] {1, -13, 78, -286, 715, -1287, 1716, -1716, 1287, -715, 286, -78, 13}, new long[] {1, 1, 3277, 478297, 15790321, 234750601, 2117950381, 13564461457L, 67662254017L, 278985273841L, 990099009901L, 3112703553961L, 8854610100337L});
  }
}
