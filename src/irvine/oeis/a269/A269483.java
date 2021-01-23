package irvine.oeis.a269;

import irvine.oeis.LinearRecurrence;

/**
 * A269483 a(n) = n^12 - n^11 + n^9 - n^8 + n^6 - n^4 + n^3 - n + 1.
 * @author Sean A. Irvine
 */
public class A269483 extends LinearRecurrence {

  /** Construct the sequence. */
  public A269483() {
    super(new long[] {1, -13, 78, -286, 715, -1287, 1716, -1716, 1287, -715, 286, -78, 13}, new long[] {1, 1, 2359, 368089, 12783421, 196890121, 1822428931, 11898664849L, 60247241209L, 251393376241L, 900900990991L, 2855262053161L, 8177824843189L});
  }
}
