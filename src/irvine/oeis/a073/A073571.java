package irvine.oeis.a073;

import java.util.Iterator;

import irvine.math.polynomial.IrreduciblePolynomials;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A073571 Irreducible trinomials: numbers n such that x^n + x^k + 1 is an irreducible polynomial (mod 2) for some k with 0 &lt; k &lt; n.
 * @author Sean A. Irvine
 */
public class A073571 implements Sequence {

  private final Iterator<Polynomial<Z>> mPolynomialIterator = IrreduciblePolynomials.iterator();
  private Polynomial<Z> mP = mPolynomialIterator.next();
  private int mN = 1;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      while (mP.degree() < mN) {
        mP = mPolynomialIterator.next();
      }
      while (mP.degree() == mN) {
        if (IrreduciblePolynomials.isTrinomial(mP)) {
          return Z.valueOf(mN);
        }
        mP = mPolynomialIterator.next();
      }
    }
  }
}
