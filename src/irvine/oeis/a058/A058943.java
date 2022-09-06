package irvine.oeis.a058;

import java.util.Iterator;

import irvine.math.polynomial.IrreduciblePolynomials;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A058943 Coefficients of irreducible polynomials over GF(2) listed in lexicographic order.
 * @author Sean A. Irvine
 */
public class A058943 implements Sequence {

  private final Iterator<Polynomial<Z>> mPolys = IrreduciblePolynomials.iterator();

  @Override
  public Z next() {
    return new Z(Long.toBinaryString(IrreduciblePolynomials.makeLong(mPolys.next())));
  }
}
