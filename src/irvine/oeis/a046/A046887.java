package irvine.oeis.a046;

import java.util.HashSet;

import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.math.cyclotomic.CyclotomicPolynomials;
import irvine.oeis.Sequence1;

/**
 * A046887 Numbers n such that the cyclotomic polynomial of order n has a nonzero coefficient which does not appear in any cyclotomic polynomials of lower order.
 * @author Sean A. Irvine
 */
public class A046887 extends Sequence1 {

  private final CyclotomicPolynomials mCyclotomicPolynomials = new CyclotomicPolynomials();
  private final HashSet<Z> mSeen = new HashSet<>();
  {
    mSeen.add(Z.ZERO);
  }
  private int mN = 0;

  @Override
  public Z next() {
    while (true) {
      final Polynomial<Z> cp = mCyclotomicPolynomials.get(++mN);
      boolean ok = false;
      for (final Z c : cp) {
        ok |= mSeen.add(c);
      }
      if (ok) {
        return Z.valueOf(mN);
      }
    }
  }
}
