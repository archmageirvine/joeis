package irvine.oeis.a014;

import java.util.Iterator;

import irvine.math.polynomial.IrreduciblePolynomials;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A014580 Binary irreducible polynomials (primes in the ring GF(2)[X]), evaluated at X=2.
 * @author Sean A. Irvine
 */
public class A014580 extends Sequence1 {

  private final Iterator<Polynomial<Z>> mPolys = IrreduciblePolynomials.iterator();

  @Override
  public Z next() {
    return Z.valueOf(IrreduciblePolynomials.makeLong(mPolys.next()));
  }
}
