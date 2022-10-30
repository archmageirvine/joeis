package irvine.oeis.a057;

import java.util.Iterator;

import irvine.math.polynomial.IrreduciblePolynomials;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A057751 Irreducible trinomials of prime degree for some k: x^p + x^k + 1 is irreducible over GF(2) for at least one k, p&gt;k&gt;0.
 * @author Sean A. Irvine
 */
public class A057751 extends A000040 {

  {
    setOffset(0);
  }

  private final Iterator<Polynomial<Z>> mPolynomialIterator = IrreduciblePolynomials.iterator();
  private Polynomial<Z> mP = mPolynomialIterator.next();

  @Override
  public Z next() {
    while (true) {
      final int n = super.next().intValueExact();
      while (mP.degree() < n) {
        mP = mPolynomialIterator.next();
      }
      while (mP.degree() == n) {
        if (IrreduciblePolynomials.isTrinomial(mP)) {
          return Z.valueOf(n);
        }
        mP = mPolynomialIterator.next();
      }
    }
  }
}
