package irvine.oeis.a057;

import java.util.Iterator;

import irvine.math.polynomial.IrreduciblePolynomials;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A057646 a(n) is the number of trinomials x^n + x^k + 1 that are irreducible over GF(2) for some k with n &gt; k &gt; 0.
 * @author Sean A. Irvine
 */
public class A057646 implements Sequence {

  private final Iterator<Polynomial<Z>> mPolynomialIterator = IrreduciblePolynomials.iterator();
  private Polynomial<Z> mP = mPolynomialIterator.next();
  private int mN = 1;

  private boolean isTrinomial(final Polynomial<Z> p) {
    int nonzero = 0;
    // exclude 1 and p.degree which are known to be present
    for (int k = 1; k < p.degree(); ++k) {
      if (!p.coeff(k).isZero() && ++nonzero > 1) {
        return false;
      }
    }
    return nonzero == 1;
  }

  @Override
  public Z next() {
    ++mN;
    while (mP.degree() < mN) {
      mP = mPolynomialIterator.next();
    }
    long count = 0;
    while (mP.degree() == mN) {
      if (isTrinomial(mP)) {
        ++count;
      }
      mP = mPolynomialIterator.next();
    }
    return Z.valueOf(count);
  }
}
