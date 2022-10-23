package irvine.oeis.a057;

import java.util.Iterator;

import irvine.math.polynomial.IrreduciblePolynomials;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A057646 a(n) is the number of trinomials x^n + x^k + 1 that are irreducible over GF(2) for some k with n &gt; k &gt; 0.
 * @author Sean A. Irvine
 */
public class A057646 extends Sequence2 {

  private final Iterator<Polynomial<Z>> mPolynomialIterator = IrreduciblePolynomials.iterator();
  private Polynomial<Z> mP = mPolynomialIterator.next();
  private int mN = 1;

  @Override
  public Z next() {
    ++mN;
    while (mP.degree() < mN) {
      mP = mPolynomialIterator.next();
    }
    long count = 0;
    while (mP.degree() == mN) {
      if (IrreduciblePolynomials.isTrinomial(mP)) {
        ++count;
      }
      mP = mPolynomialIterator.next();
    }
    return Z.valueOf(count);
  }
}
