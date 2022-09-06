package irvine.oeis.a058;

import irvine.math.group.GaloisField;

/**
 * A058945 Coefficients of monic irreducible polynomials over GF(5) listed in lexicographic order.
 * @author Sean A. Irvine
 */
public class A058945 extends A058944 {

  /** Construct the sequence. */
  public A058945() {
    super(new GaloisField(5));
  }
}
