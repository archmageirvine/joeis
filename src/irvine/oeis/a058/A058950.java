package irvine.oeis.a058;

import irvine.math.group.GaloisField;

/**
 * A058950 Coefficients of monic primitive irreducible polynomials over GF(5) listed in lexicographic order.
 * @author Sean A. Irvine
 */
public class A058950 extends A058947 {

  /** Construct the sequence. */
  public A058950() {
    super(new GaloisField(5));
  }
}
