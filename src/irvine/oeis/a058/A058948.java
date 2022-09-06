package irvine.oeis.a058;

import irvine.math.group.GaloisField;
import irvine.math.z.Z;

/**
 * A058948 Coefficients of monic irreducible polynomials over GF(4) listed in lexicographic order.
 * @author Sean A. Irvine
 */
public class A058948 extends A058944 {

  /** Construct the sequence. */
  public A058948() {
    super(new GaloisField(Z.TWO, 2));
  }
}
