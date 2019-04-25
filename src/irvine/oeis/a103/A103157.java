package irvine.oeis.a103;

import irvine.oeis.LinearRecurrence;

/**
 * A103157 Number of ways to choose 4 distinct points from an <code>(n+1)</code> X <code>(n+1)</code> X <code>(n+1)</code> lattice cube.
 * @author Sean A. Irvine
 */
public class A103157 extends LinearRecurrence {

  /** Construct the sequence. */
  public A103157() {
    super(new long[] {1, -13, 78, -286, 715, -1287, 1716, -1716, 1287, -715, 286, -78, 13}, new long[] {70, 17550, 635376, 9691375, 88201170, 566685735, 2829877120L, 11671285626L, 41417124750L, 130179173740L, 370215608400L, 968104633665L, 2357084537626L});
  }
}
