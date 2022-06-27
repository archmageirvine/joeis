package irvine.oeis.a057;

import java.util.Iterator;

import irvine.math.polynomial.IrreduciblePolynomials;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A057774 Values of k corresponding to A073571.
 * @author Sean A. Irvine
 */
public class A057774 implements Sequence {

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
          for (int k = 1; k < mP.degree(); ++k) {
            if (!mP.coeff(k).isZero()) {
              return Z.valueOf(k);
            }
          }
        }
        mP = mPolynomialIterator.next();
      }
    }
  }
}
