package irvine.oeis.a259;

import irvine.oeis.LinearRecurrence;

/**
 * A259395 a(n) = -3*n^2*(n-1)^4*(n+1)*(11*n^3+49*n^2-439*n+171).
 * @author Sean A. Irvine
 */
public class A259395 extends LinearRecurrence {

  /** Construct the sequence. */
  public A259395() {
    super(new long[] {1, -11, 55, -165, 330, -462, 462, -330, 165, -55, 11}, new long[] {0, 0, 15228, 705024, 1885680, -66355200, -792382500, -4986842112L, -22516232256L, -81696522240L, -252908835300L});
  }
}
