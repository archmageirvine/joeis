package irvine.oeis.a071;

import java.util.Iterator;

import irvine.math.polynomial.IrreduciblePolynomials;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A071802 Table in which n-th row gives exponents (in decreasing order) of lexicographically earliest primitive irreducible polynomial of degree n over GF(2).
 * @author Sean A. Irvine
 */
public class A071802 extends Sequence1 {

  private final Iterator<Polynomial<Z>> mPolys = IrreduciblePolynomials.iterator();
  {
    mPolys.next(); // skip x
  }
  private Polynomial<Z> mP = Polynomial.create(0);
  private int mM = 0;

  @Override
  public Z next() {
    while (true) {
      if (--mM < 0) {
        final int d = mP.degree();
        do {
          mP = mPolys.next();
        } while (mP.degree() <= d);
        mM = mP.degree();
      }
      if (!mP.get(mM).isZero()) {
        return Z.valueOf(mM);
      }
    }
  }
}
