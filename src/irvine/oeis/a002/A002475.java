package irvine.oeis.a002;

import java.util.ArrayList;
import java.util.Iterator;

import irvine.math.polynomial.IrreduciblePolynomials;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A002475 Numbers k such that x^k + x + 1 is irreducible over GF(2).
 * @author Sean A. Irvine
 */
public class A002475 implements Sequence {

  private int mN = 0;

  private Polynomial<Z> makePoly(final int n) {
    if (n == 1) {
      return Polynomial.create(1);
    }
    final long[] coeff = new long[n + 1];
    coeff[0] = 1;
    coeff[1] = 1;
    coeff[n] = 1;
    return Polynomial.create(coeff);
  }
  
  private final ArrayList<Polynomial<Z>> mIrreducibles = new ArrayList<>();
  private final Iterator<Polynomial<Z>> mIterator = IrreduciblePolynomials.iterator();  

  private Polynomial<Z> irreducible(final int n) {
    while (n >= mIrreducibles.size()) {
      mIrreducibles.add(mIterator.next());
    }
    return mIrreducibles.get(n);
  }

  @Override
  public Z next() {
    if (mN == 0) {
      ++mN;
      return Z.ZERO;
    }
    while (true) {
      final Polynomial<Z> p = makePoly(++mN);
      int i = -1;
      while (true) {
        final Polynomial<Z> d = irreducible(++i);
        if (p.equals(d)) {
          return Z.valueOf(mN);
        }
        if (d.degree() >= p.degree()) {
          break;
        }
      }
    }
  }
}
