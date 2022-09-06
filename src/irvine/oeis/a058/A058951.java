package irvine.oeis.a058;

import irvine.math.group.GaloisField;

/**
 * A058951 Coefficients of monic primitive irreducible polynomials over GF(7) listed in lexicographic order.
 * @author Sean A. Irvine
 */
public class A058951 extends A058947 {

  /** Construct the sequence. */
  public A058951() {
    super(new GaloisField(7));
  }
}
