package irvine.oeis.a058;

import irvine.math.group.GaloisField;

/**
 * A058949 Coefficients of monic primitive irreducible polynomials over GF(3) listed in lexicographic order.
 * @author Sean A. Irvine
 */
public class A058949 extends A058947 {

  /** Construct the sequence. */
  public A058949() {
    super(new GaloisField(3));
  }
}
