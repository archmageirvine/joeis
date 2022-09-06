package irvine.oeis.a058;

import irvine.math.group.GaloisField;

/**
 * A058946 Coefficients of monic irreducible polynomials over GF(7) listed in lexicographic order.
 * @author Sean A. Irvine
 */
public class A058946 extends A058944 {

  /** Construct the sequence. */
  public A058946() {
    super(new GaloisField(7));
  }
}
